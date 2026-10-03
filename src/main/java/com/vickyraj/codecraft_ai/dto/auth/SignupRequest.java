package com.vickyraj.codecraft_ai.dto.auth;

public record SignupRequest(
        String email,
        String name,
        String password) {
}
