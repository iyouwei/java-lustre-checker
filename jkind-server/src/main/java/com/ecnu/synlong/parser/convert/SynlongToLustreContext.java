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
    
    public void addStateAssignment(String stateName, String assignment) {
        stateAssignments.computeIfAbsent(stateName, k -> new ArrayList<>()).add(assignment);
    }
    
    public List<String> getStateAssignments(String stateName) {
        return stateAssignments.getOrDefault(stateName, Collections.emptyList());
    }
    
    // 获取所有状态局部变量的类型信息
    public Map<String, String> getAllStateVarTypes() {
        Map<String, String> allVarTypes = new HashMap<>();
        for (Map<String, String> stateVars : stateVarTypes.values()) {
            allVarTypes.putAll(stateVars);
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
    
    // 生成状态机局部变量定义
    public String generateStateMachineLocalVars() {
        Map<String, String> allVarTypes = getAllStateVarTypes();
        
        if (allVarTypes.isEmpty()) {
            return "";
        }
        
        StringBuilder sb = new StringBuilder("var\n");
        for (Map.Entry<String, String> entry : allVarTypes.entrySet()) {
            String varName = entry.getKey();
            String varType = entry.getValue();
            sb.append("\t").append(varName).append(" : ").append(varType).append(";\n");
        }
        return sb.toString();
    }
    
    // 生成状态机条件赋值
    public String generateStateMachineConditionalAssignments() {
        StringBuilder sb = new StringBuilder();
        
        for (String stateName : allStates) {
            List<String> assignments = getStateAssignments(stateName);
            if (!assignments.isEmpty()) {
                sb.append("-- State ").append(stateName).append(" assignments\n");
                for (String assignment : assignments) {
                    sb.append("if (state = ").append(stateName).append(") then ").append(assignment).append("\n");
                }
            }
        }
        
        return sb.toString();
    }
}
