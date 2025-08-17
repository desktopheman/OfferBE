package com.ssasify.offerpay.models.login;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users",
    uniqueConstraints = {
      @UniqueConstraint(columnNames = "username"),
      @UniqueConstraint(columnNames = "email")
    })
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotBlank
  @Size(max = 20)
  private String username;

  @NotBlank
  @Size(max = 50)
  @Email
  private String email;

  @NotBlank
  @Size(max = 120)
  private String password;

  private Integer points;

  @Lob
  @Column(name = "picture")
  private byte[] picture;

  @Column(name = "offer_play")
  private Integer offerPlay;

  @Column(name = "log_date")
  private LocalDate logDate;

  @Size(max = 20)
  @Column(name = "refer_id")
  private String referID;

  @Column(name = "refer_join_status")
  private Integer referJoinStatus;

  @Column(name = "total_referral")
  private Integer totalReferral;

  @Column(name = "refer_by")
  private Integer referBy;

  private Integer status;

  @Column(name = "email_verified_at")
  private LocalDate emailVerifiedAt;

  @Column(name = "remember_token")
  private String rememberToken;

  @Column(name = "register_agent")
  private String registerAgent;

  @Column(name = "login_agent")
  private String loginAgent;

  @Column(name = "created_at")
  private LocalDate createdAt;

  @Column(name = "updated_at")
  private LocalDate updatedAt;



  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(  name = "user_roles",
        joinColumns = @JoinColumn(name = "user_id"),
        inverseJoinColumns = @JoinColumn(name = "role_id"))
  private Set<Role> roles = new HashSet<>();

  public User() {
  }

  public User(String username, String email, String password) {
    this.username = username;
    this.email = email;
    this.password = password;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Set<Role> getRoles() {
    return roles;
  }

  public void setRoles(Set<Role> roles) {
    this.roles = roles;
  }

  public Integer getPoints() {
    return points;
  }

  public void setPoints(Integer points) {
    this.points = points;
  }

  public byte[] getPicture() {
    return picture;
  }

  public void setPicture(byte[] picture) {
    this.picture = picture;
  }

  public Integer getOfferPlay() {
    return offerPlay;
  }

  public void setOfferPlay(Integer offerPlay) {
    this.offerPlay = offerPlay;
  }

  public LocalDate getLogDate() {
    return logDate;
  }

  public void setLogDate(LocalDate logDate) {
    this.logDate = logDate;
  }

  public @Size(max = 20) String getReferID() {
    return referID;
  }

  public void setReferID(@Size(max = 20) String referID) {
    this.referID = referID;
  }

  public Integer getReferJoinStatus() {
    return referJoinStatus;
  }

  public void setReferJoinStatus(Integer referJoinStatus) {
    this.referJoinStatus = referJoinStatus;
  }

  public Integer getTotalReferral() {
    return totalReferral;
  }

  public void setTotalReferral(Integer totalReferral) {
    this.totalReferral = totalReferral;
  }

  public Integer getReferBy() {
    return referBy;
  }

  public void setReferBy(Integer referBy) {
    this.referBy = referBy;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public LocalDate getEmailVerifiedAt() {
    return emailVerifiedAt;
  }

  public void setEmailVerifiedAt(LocalDate emailVerifiedAt) {
    this.emailVerifiedAt = emailVerifiedAt;
  }

  public String getRememberToken() {
    return rememberToken;
  }

  public void setRememberToken(String rememberToken) {
    this.rememberToken = rememberToken;
  }

  public String getRegisterAgent() {
    return registerAgent;
  }

  public void setRegisterAgent(String registerAgent) {
    this.registerAgent = registerAgent;
  }

  public String getLoginAgent() {
    return loginAgent;
  }

  public void setLoginAgent(String loginAgent) {
    this.loginAgent = loginAgent;
  }

  public LocalDate getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDate createdAt) {
    this.createdAt = createdAt;
  }

  public LocalDate getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(LocalDate updatedAt) {
    this.updatedAt = updatedAt;
  }
}
