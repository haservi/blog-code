package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import com.example.demo.dto.LoginDto.Request;
import com.example.demo.dto.LoginDto.Response;
import com.example.demo.service.LoginService;

@Service
public class LoginGithubService implements LoginService {

  @Override
  public Response login(Request dto) {
    System.out.println("github login logic");
    return null;
  }

}
