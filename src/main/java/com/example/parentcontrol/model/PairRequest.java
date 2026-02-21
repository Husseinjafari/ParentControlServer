package com.example.parentcontrol.model;

public class PairRequest {
    private String deviceUniqueCode;
    private Long parentId;

    public String getDeviceUniqueCode() {
        return deviceUniqueCode;
    }

    public void setDeviceUniqueCode(String deviceUniqueCode) {
        this.deviceUniqueCode = deviceUniqueCode;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }
}
