package com.tosan.dockerexercise.controller;

import com.tosan.dockerexercise.dto.AuthorResponseDto;
import com.tosan.dockerexercise.dto.GreetingResponseDto;
import com.tosan.dockerexercise.service.GreetingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final Logger logger = LoggerFactory.getLogger(GreetingController.class);

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping(value = "/hello")
    public ResponseEntity<GreetingResponseDto> hello(@RequestParam(value = "name", required = false) String name) {
        logger.info("request greeting, name = " + name);
        return ResponseEntity.ok(greetingService.greet(name));
    }

    @GetMapping(value = "/author")
    public ResponseEntity<AuthorResponseDto> author() {
        return ResponseEntity.ok(new AuthorResponseDto("Fateme Ebrahimi"));
    }
}
