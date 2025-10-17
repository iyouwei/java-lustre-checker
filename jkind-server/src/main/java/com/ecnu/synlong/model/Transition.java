package com.ecnu.synlong.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 转换数据类
 */
@Data
public class Transition {
    
    /**
     * 转换ID
     */
    @JsonProperty("id")
    private Integer id;
    
    /**
     * 源状态ID
     */
    @JsonProperty("source_id")
    private Integer sourceId;
    
    /**
     * 目标状态ID
     */
    @JsonProperty("target_id")
    private Integer targetId;
    
    /**
     * 选择条件
     */
    @JsonProperty("select")
    private String select;
    
    /**
     * 守卫条件
     */
    @JsonProperty("guard")
    private String guard;
    
    /**
     * 同步条件
     */
    @JsonProperty("sync")
    private String sync;
    
    /**
     * 更新语句
     */
    @JsonProperty("update")
    private String update;
}
