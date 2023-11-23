package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long userId;

  @NotEmpty(message = "First name cannot be empty")
  @Size(min = 2, max = 50, message = "First name must be between 2 and 50 characters")
  private String firstname;

  @NotEmpty(message = "Last name cannot be empty")
  @Size(min = 2, max = 50, message = "Last name must be between 2 and 50 characters")
  private String lastname;

  @NotEmpty(message = "Email cannot be empty")
  @Email(message = "Invalid email format")
  private String email;

  @NotEmpty(message = "Password cannot be empty")
  @Size(min = 6, max = 100, message = "Password must be between 6 and 100 characters")
  private String password;

  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
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
}
