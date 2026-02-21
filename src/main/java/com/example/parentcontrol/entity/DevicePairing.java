package com.example.parentcontrol.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "device_pairing")
public class DevicePairing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String deviceUniqueCode;  // کد ۶ رقمی یا UUID

    @Column(nullable = false)
    private String deviceId;  // Android ID

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private User parent;  // والدی که این دستگاه رو ثبت کرده

    @Column(nullable = false)
    private boolean isPaired = false;  // جفت شده یا نه

    @Column(nullable = false)
    private LocalDateTime createdAt;

    private LocalDateTime pairedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeviceUniqueCode() {
        return deviceUniqueCode;
    }

    public void setDeviceUniqueCode(String deviceUniqueCode) {
        this.deviceUniqueCode = deviceUniqueCode;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public User getParent() {
        return parent;
    }

    public void setParent(User parent) {
        this.parent = parent;
    }

    public boolean isPaired() {
        return isPaired;
    }

    public void setPaired(boolean paired) {
        isPaired = paired;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getPairedAt() {
        return pairedAt;
    }

    public void setPairedAt(LocalDateTime pairedAt) {
        this.pairedAt = pairedAt;
    }
}
