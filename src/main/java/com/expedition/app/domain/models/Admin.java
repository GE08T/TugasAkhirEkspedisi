package com.expedition.app.domain.models;

public class Admin {
  private String name;
  private String username;
  private String password;

  public Admin (String name, String username, String password) {
    this.name = name;
    this.username = username;
    this.password = password;
  }

  public String getName() {
    return name;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void update(String newName, String newUsername, String newPassword) {
    if (!newName.trim().isEmpty()) {
      this.name = newName;
    }
    if (!newUsername.trim().isEmpty()) {
      this.username = newUsername;
    }
    if (!newPassword.trim().isEmpty()) {
      this.password = newPassword;
    }
  }
}
