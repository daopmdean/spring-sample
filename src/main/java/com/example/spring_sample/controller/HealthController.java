package com.example.spring_sample.controller;

import com.example.spring_sample.service.HealthService;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE, makeFinal = true)
public class HealthController {

  HealthService healthService;

  @GetMapping(value = "/healthcheck/_check")
  public String check() {
    return healthService.healthCheck();
  }

}
