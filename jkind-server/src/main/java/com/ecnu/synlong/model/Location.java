package com.ecnu.synlong.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 位置（状态）数据类
 */
@Data
public class Location {
    
    /**
     * 位置ID
     */
    @JsonProperty("id")
    private Integer id;
    
    /**
     * 位置名称
     */
    @JsonProperty("name")
    private String name;
    
    /**
     * 不变量
     */
    @JsonProperty("invariant")
    private String invariant;
}
