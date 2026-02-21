package com.example.parentcontrol.model;

// مدل ثبت نام دستگاه
public class ParentRegistrationRequest {
    private String deviceId;
    private String deviceName;
    private String androidVersion;
    private String childName;  // اسم فرزند

    public ParentRegistrationRequest() {}

    public ParentRegistrationRequest(String deviceId, String deviceName,
                                     String androidVersion, String childName) {
        this.deviceId = deviceId;
        this.deviceName = deviceName;
        this.androidVersion = androidVersion;
        this.childName = childName;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getAndroidVersion() {
        return androidVersion;
    }

    public void setAndroidVersion(String androidVersion) {
        this.androidVersion = androidVersion;
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }
}