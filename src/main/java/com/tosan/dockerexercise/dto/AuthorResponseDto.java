package com.tosan.dockerexercise.dto;

public class AuthorResponseDto {

    private String name;

    public AuthorResponseDto(String name) {
        this.name = name;
    }

    public AuthorResponseDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
