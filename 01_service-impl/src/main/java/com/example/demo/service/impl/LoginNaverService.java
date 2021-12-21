package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import com.example.demo.dto.LoginDto.Request;
import com.example.demo.dto.LoginDto.Response;
import com.example.demo.service.LoginService;

@Service
public class LoginNaverService implements LoginService {

  @Override
  public Response login(Request dto) {
    System.out.println("naver login logic");
    return null;
  }

}
