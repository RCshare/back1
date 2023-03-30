package com.personal.security.controller;

import com.personal.security.service.MethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo-controller")
public class DemoController {

  @Autowired
  MethodService methodService;
  @GetMapping
  public ResponseEntity<String> sayHello() {
    return ResponseEntity.ok(methodService.callExternalServiceMethods());
  }

}
