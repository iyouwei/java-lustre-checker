package com.ecnu.synlong.parser.convert;

public class SynlongToLustreException extends RuntimeException {
    private String contextInfo;

    public SynlongToLustreException(String message) {
        super(message);
    }
    public SynlongToLustreException(String message, Throwable cause) {
        super(message, cause);
    }
    public SynlongToLustreException(String message, String contextInfo) {
        super(message);
        this.contextInfo = contextInfo;
    }
    public String getContextInfo() {
        return contextInfo;
    }
} 