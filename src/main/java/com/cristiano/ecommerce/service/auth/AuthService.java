package com.cristiano.ecommerce.service.auth;

import com.cristiano.ecommerce.dto.SignupRequest;
import com.cristiano.ecommerce.dto.UserDto;

public interface AuthService {

    UserDto createUser(SignupRequest signupRequest);

    boolean hasUserWithEmail(String email);
}
