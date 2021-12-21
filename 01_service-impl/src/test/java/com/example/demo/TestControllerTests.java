package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.dto.LoginDto;
import com.example.demo.model.AuthProvider;
import com.example.demo.service.LoginFactory;
import com.example.demo.service.LoginService;
import com.example.demo.service.impl.LoginLocalService;
import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class TestControllerTests {
  
  @Test
  void 로그인_타입_테스트() {
    LoginFactory loginFactory = new LoginFactory();
    
    LoginDto.Request request = new LoginDto.Request();
    
    LoginService loginService = new LoginLocalService();
    
    request.setAuthProvider(AuthProvider.github);
    loginService = loginFactory.getLoginType(request);
    loginService.login(request);
    
    request.setAuthProvider(AuthProvider.google);
    loginService = loginFactory.getLoginType(request);
    loginService.login(request);
    
    request.setAuthProvider(AuthProvider.kakao);
    loginService = loginFactory.getLoginType(request);
    loginService.login(request);
    
    request.setAuthProvider(AuthProvider.naver);
    loginService = loginFactory.getLoginType(request);
    loginService.login(request);
    
    request.setAuthProvider(AuthProvider.local);
    loginService = loginFactory.getLoginType(request);
    loginService.login(request);
    
    
    
  }

}
