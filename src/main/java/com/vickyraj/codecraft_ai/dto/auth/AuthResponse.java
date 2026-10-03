package com.vickyraj.codecraft_ai.dto.auth;

public record AuthResponse(String tokens, UserProfileResponse user) {

}

//dummy new AuthResponse("", new UserProfileResponse());

