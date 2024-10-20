package com.example.spring_sample.service;

import org.springframework.stereotype.Service;

@Service
public class HealthService {
  public String healthCheck() {
    return "OK";
  }
}
