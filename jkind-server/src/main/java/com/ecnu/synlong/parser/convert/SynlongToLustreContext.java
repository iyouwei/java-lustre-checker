package com.ecnu.synlong.parser.convert;

import java.util.*;

public class SynlongToLustreContext {
    // 状态名映射
    private final Map<String, String> stateNameMap = new HashMap<>();
    // 已声明变量集合
    private final Set<String> declaredVars = new HashSet<>();
    // 初始状态
    private String initialState = null;
    // 最终状态集合
    private final Set<String> finalStates = new HashSet<>();
    
    // 新增：状态机相关收集
    private final Set<String> allStates = new HashSet<>();
    private final Map<String, Set<String>> stateLocalVars = new HashMap<>();
    private final Map<String, String> stateBodies = new HashMap<>();
    private final Map<String, List<String>> stateTransitions = new HashMap<>();
    
    // 新增：状态局部变量类型和赋值收集
    private final Map<String, Map<String, String>> stateVarTypes = new HashMap<>(); // stateName -> (varName -> type)
    private final Map<String, List<String>> stateAssignments = new HashMap<>(); // stateName -> list of assignments
    
    // 新增：全局类型定义收集
    private final List<String> globalTypeDefs = new ArrayList<>();
    private final List<String> globalConstDefs = new ArrayList<>();
    private final List<String> globalNodeDefs = new ArrayList<>();
    
    // 新增：结构体构造函数收集
    private final Set<String> structTypes = new HashSet<>(); // 需要生成构造函数的结构体类型

    public void addState(String synlongState, String lustreState) {
        stateNameMap.put(synlongState, lustreState);
    }

    public String getLustreState(String synlongState) {
        return stateNameMap.getOrDefault(synlongState, synlongState);
    }

    public void declareVar(String var) {
        declaredVars.add(var);
    }

    public boolean isVarDeclared(String var) {
        return declaredVars.contains(var);
    }

    public void setInitialState(String state) {
        this.initialState = state;
    }

    public String getInitialState() {
        return initialState;
    }

    public void addFinalState(String state) {
        finalStates.add(state);
    }

    public boolean isFinalState(String state) {
        return finalStates.contains(state);
    }

    public Set<String> getFinalStates() {
        return Collections.unmodifiableSet(finalStates);
    }
    
    // 新增：状态机相关方法
    public void addStateToEnum(String stateName) {
        allStates.add(stateName);
    }
    
    public Set<String> getAllStates() {
        return Collections.unmodifiableSet(allStates);
    }
    
    public void addStateLocalVar(String stateName, String varName) {
        stateLocalVars.computeIfAbsent(stateName, k -> new HashSet<>()).add(varName);
    }
    
    public Set<String> getStateLocalVars(String stateName) {
        return stateLocalVars.getOrDefault(stateName, Collections.emptySet());
    }
    
    public void setStateBody(String stateName, String body) {
        stateBodies.put(stateName, body);
    }
    
    public String getStateBody(String stateName) {
        return stateBodies.get(stateName);
    }
    
    public void addStateTransition(String stateName, String transition) {
        stateTransitions.computeIfAbsent(stateName, k -> new ArrayList<>()).add(transition);
    }
    
    public List<String> getStateTransitions(String stateName) {
        return stateTransitions.getOrDefault(stateName, Collections.emptyList());
    }
    
    // 新增：状态局部变量类型和赋值方法
    public void addStateVarType(String stateName, String varName, String type) {
        stateVarTypes.computeIfAbsent(stateName, k -> new HashMap<>()).put(varName, type);
    }
    
    public String getStateVarType(String stateName, String varName) {
        return stateVarTypes.getOrDefault(stateName, Collections.emptyMap()).get(varName);
    }
    
    // 生成带前缀的变量名
    public String getPrefixedVarName(String stateName, String varName) {
        return stateName + "_" + varName;
    }
    
    // 检查变量是否是状态局部变量（需要前缀）
    public boolean isStateLocalVar(String stateName, String varName) {
        return stateVarTypes.containsKey(stateName) && 
               stateVarTypes.get(stateName).containsKey(varName);
    }
    
    // 获取变量在特定状态下的正确名称（如果是状态变量则加前缀）
    public String getCorrectVarName(String stateName, String varName) {
        if (isStateLocalVar(stateName, varName)) {
            return getPrefixedVarName(stateName, varName);
        }
        return varName; // 全局变量保持原名
    }
    
    public void addStateAssignment(String stateName, String assignment) {
        stateAssignments.computeIfAbsent(stateName, k -> new ArrayList<>()).add(assignment);
    }
    
    public List<String> getStateAssignments(String stateName) {
        return stateAssignments.getOrDefault(stateName, Collections.emptyList());
    }
    
    // 获取所有状态局部变量的类型信息（带前缀）
    public Map<String, String> getAllStateVarTypes() {
        Map<String, String> allVarTypes = new HashMap<>();
        for (Map.Entry<String, Map<String, String>> stateEntry : stateVarTypes.entrySet()) {
            String stateName = stateEntry.getKey();
            Map<String, String> stateVars = stateEntry.getValue();
            for (Map.Entry<String, String> varEntry : stateVars.entrySet()) {
                String originalVarName = varEntry.getKey();
                String varType = varEntry.getValue();
                String prefixedVarName = getPrefixedVarName(stateName, originalVarName);
                allVarTypes.put(prefixedVarName, varType);
            }
        }
        return allVarTypes;
    }
    
    // 新增：全局定义收集方法
    public void addGlobalTypeDef(String typeDef) {
        globalTypeDefs.add(typeDef);
    }
    
    public void addGlobalConstDef(String constDef) {
        globalConstDefs.add(constDef);
    }
    
    public void addGlobalNodeDef(String nodeDef) {
        globalNodeDefs.add(nodeDef);
    }
    
    public List<String> getGlobalTypeDefs() {
        return Collections.unmodifiableList(globalTypeDefs);
    }
    
    public List<String> getGlobalConstDefs() {
        return Collections.unmodifiableList(globalConstDefs);
    }
    
    public List<String> getGlobalNodeDefs() {
        return Collections.unmodifiableList(globalNodeDefs);
    }
    
    // 生成状态枚举类型定义
    public String generateStateEnumType() {
        if (allStates.isEmpty()) {
            return "";
        }
        return "type State = enum {" + String.join(", ", allStates) + "};\n";
    }
    
    // 生成状态机局部变量定义（只包含状态机相关变量，不包含状态变量本身）
    public String generateStateMachineLocalVars() {
        Map<String, String> allVarTypes = getAllStateVarTypes();
        
        if (allVarTypes.isEmpty()) {
            return "";
        }
        
        StringBuilder sb = new StringBuilder();
        // 只生成状态局部变量，状态变量本身由调用方处理
        for (Map.Entry<String, String> entry : allVarTypes.entrySet()) {
            String varName = entry.getKey();
            String varType = entry.getValue();
            sb.append("\t").append(varName).append(" : ").append(varType).append(";\n");
        }
        return sb.toString();
    }
    
    // 检查是否有状态机变量需要声明
    public boolean hasStateMachineVars() {
        return !allStates.isEmpty() || !getAllStateVarTypes().isEmpty();
    }
    
    // 生成状态机条件赋值
    public String generateStateMachineConditionalAssignments() {
        StringBuilder sb = new StringBuilder();
        
        for (String stateName : allStates) {
            List<String> assignments = getStateAssignments(stateName);
            if (!assignments.isEmpty()) {
                sb.append("-- State ").append(stateName).append(" assignments\n");
                for (String assignment : assignments) {
                    // 将原本的 "if (state = S) then <assignment>" 形式改为 "<prefixed_lhs> = if (state = S) then <prefixed_rhs>"
                    int eq = assignment.indexOf('=');
                    if (eq > 0) {
                        String originalLhs = assignment.substring(0, eq).trim();
                        String originalRhs = assignment.substring(eq + 1).trim();
                        
                        // 只有状态局部变量才加前缀，全局变量不加前缀
                        String correctLhs = getCorrectVarName(stateName, originalLhs);
                        
                        // 处理rhs中可能包含的状态变量引用，也需要加前缀
                        String processedRhs = processRhsVariableReferences(stateName, originalRhs);
                        
                        sb.append(correctLhs).append(" = if (state = ").append(stateName).append(") then ").append(processedRhs).append(" else pre(").append(correctLhs).append(");\n");
                    } else {
                        // 无法解析则回退到原来的包裹形式
                        sb.append("if (state = ").append(stateName).append(") then ").append(assignment).append("\n");
                    }
                }
            }
        }
        
        return sb.toString();
    }
    
    // 处理右侧表达式中的变量引用，为状态变量添加前缀
    private String processRhsVariableReferences(String currentStateName, String rhs) {
        // 这是一个简化版本，实际可能需要更复杂的解析
        // 目前只处理简单的变量引用
        String processedRhs = rhs;
        
        // 检查是否包含当前状态的局部变量
        for (Map.Entry<String, Map<String, String>> stateEntry : stateVarTypes.entrySet()) {
            String stateName = stateEntry.getKey();
            Map<String, String> stateVars = stateEntry.getValue();
            
            for (String varName : stateVars.keySet()) {
                // 如果rhs中包含状态变量名，且该变量属于当前状态，则添加前缀
                if (stateName.equals(currentStateName) && processedRhs.contains(varName)) {
                    // 简单的字符串替换，实际应该使用更精确的解析
                    processedRhs = processedRhs.replaceAll("\\b" + varName + "\\b", getPrefixedVarName(stateName, varName));
                }
            }
        }
        
        return processedRhs;
    }
    
    // 新增：结构体构造函数相关方法
    public void addStructType(String typeName) {
        structTypes.add(typeName);
    }
    
    public Set<String> getStructTypes() {
        return Collections.unmodifiableSet(structTypes);
    }
    
    // 生成结构体构造函数
    public String generateStructConstructors() {
        StringBuilder sb = new StringBuilder();
        
        for (String typeName : structTypes) {
            sb.append("function make_").append(typeName).append("(value, status) returns (result : ").append(typeName).append(");\n");
            sb.append("let\n");
            sb.append("\tresult = {value = value; status = status};\n");
            sb.append("tel;\n\n");
        }
        
        return sb.toString();
    }
}
