package com.vickyraj.codecraft_ai.service;

import com.vickyraj.codecraft_ai.dto.auth.UserProfileResponse;

public interface UserService {
    UserProfileResponse getProfile(Long userId);
}
