package com.example.demo.service;

import com.example.demo.dto.LoginDto;
import com.example.demo.model.AuthProvider;
import com.example.demo.service.impl.LoginGithubService;
import com.example.demo.service.impl.LoginGoogleService;
import com.example.demo.service.impl.LoginKakaoService;
import com.example.demo.service.impl.LoginLocalService;

public class LoginFactory {

  public LoginService getLoginType(LoginDto.Request dto) {
    if (dto == null) {
      return null;
    }

    if (dto.getAuthProvider().equals(AuthProvider.github)) {
      return new LoginGithubService();

    } else if (dto.getAuthProvider().equals(AuthProvider.google)) {
      return new LoginGoogleService();

    } else if (dto.getAuthProvider().equals(AuthProvider.kakao)) {
      return new LoginKakaoService();

    } else if (dto.getAuthProvider().equals(AuthProvider.naver)) {
      return new LoginGoogleService();

    } else if (dto.getAuthProvider().equals(AuthProvider.local)) {
      return new LoginLocalService();
    }

    return null;
  }
}
