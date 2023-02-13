package com.tosan.dockerexercise.service;

import com.tosan.dockerexercise.dto.GreetingResponseDto;
import org.springframework.stereotype.Component;

@Component
public class GreetingService {
    public GreetingResponseDto greet(String name) {
        if(name == null || name.isEmpty()) {
            return new GreetingResponseDto("Hello Stranger");
        } else {
            return new GreetingResponseDto("Hello " + convertCamelCaseToSpaced(name));
        }
    }

    private static String convertCamelCaseToSpaced(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (i > 0 && Character.isUpperCase(c) && Character.isLowerCase(input.charAt(i - 1))) {
                result.append(" ");
            }
            result.append(c);
        }
        return result.toString();
    }

}
