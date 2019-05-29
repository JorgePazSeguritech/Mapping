package com.mapping.Mapping.persistence.model;

public enum ConditionEnum {
    REGULAR("Regular"),
    REMOTE("Remote"),
    FREE("Free");
    private String value;

    ConditionEnum(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
