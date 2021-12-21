package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import com.example.demo.dto.LoginDto.Request;
import com.example.demo.dto.LoginDto.Response;
import com.example.demo.service.LoginService;

@Service
public class LoginLocalService implements LoginService {

  @Override
  public Response login(Request dto) {
    System.out.println("local login logic");
    return null;
  }

}
