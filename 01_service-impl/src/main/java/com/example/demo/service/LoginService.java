package com.example.demo.service;

import com.example.demo.dto.LoginDto;

public interface LoginService {

  LoginDto.Response login(LoginDto.Request dto);

}
