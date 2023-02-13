package com.tosan.dockerexercise.dto;

public class GreetingResponseDto {

    public GreetingResponseDto() {
    }

    public GreetingResponseDto(String greetResult) {
        this.greetResult = greetResult;
    }

    private String greetResult;

    public String getGreetResult() {
        return greetResult;
    }

    public void setGreetResult(String greetResult) {
        this.greetResult = greetResult;
    }
}
