package com.example.demo.dto;

import com.example.demo.model.AuthProvider;

public class LoginDto {

  public static class Request {
    private AuthProvider authProvider;
    private String id;
    private String password;

    public AuthProvider getAuthProvider() {
      return authProvider;
    }

    public void setAuthProvider(AuthProvider authProvider) {
      this.authProvider = authProvider;
    }

    public String getId() {
      return id;
    }

    public void setId(String id) {
      this.id = id;
    }

    public String getPassword() {
      return password;
    }

    public void setPassword(String password) {
      this.password = password;
    }
  }

  public static class Response {
    private String name;
    private String email;

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getEmail() {
      return email;
    }

    public void setEmail(String email) {
      this.email = email;
    }
  }
}
