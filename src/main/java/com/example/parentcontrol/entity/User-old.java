//package com.example.parentcontrol.entity;
//
//import jakarta.persistence.*;
//
//import java.sql.Timestamp;
//import java.util.Set;
//
//@Entity
//@Table(name = "users") // todo use s at the end of user because its a reserved keyword in h2
//public class User {
//    private Long id;
//    private int version;
//    private String username;
//    private String firstName;
//    private String lastName;
//    private String email;
//    private String password;
//    private String phoneNumber;
//    private User inviter;
//    private String referralCode;
//    private boolean active;
//    private Timestamp createdAt;
//    @ManyToMany(fetch = FetchType.LAZY)
//    @JoinTable(name = "user_roles",
//            joinColumns = @JoinColumn(name = "user_id"),
//            inverseJoinColumns = @JoinColumn(name = "role_id"))
//    private Set<Role> roles;
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    @Version
//    public int getVersion() {
//        return version;
//    }
//
//    public void setVersion(int version) {
//        this.version = version;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//    @ManyToOne
//    public User getInviter() {
//        return inviter;
//    }
//
//    public void setInviter(User inviter) {
//        this.inviter = inviter;
//    }
//
//    @Column(unique = true)
//    public String getReferralCode() {
//        return referralCode;
//    }
//
//    public void setReferralCode(String referralCode) {
//        this.referralCode = referralCode;
//    }
//
//    public boolean isActive() {
//        return active;
//    }
//
//    public void setActive(boolean active) {
//        this.active = active;
//    }
//
//    public Timestamp getCreatedAt() {
//        return createdAt;
//    }
//
//    public void setCreatedAt(Timestamp createdAt) {
//        this.createdAt = createdAt;
//    }
//
//    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    public Set<Role> getRoles() {
//        return roles;
//    }
//
//    public void setRoles(Set<Role> roles) {
//        this.roles = roles;
//    }
//
//}
