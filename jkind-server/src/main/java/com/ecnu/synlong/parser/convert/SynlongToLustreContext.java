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
}
