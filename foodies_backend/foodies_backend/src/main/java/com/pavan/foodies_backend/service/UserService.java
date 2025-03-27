package com.pavan.foodies_backend.service;

import com.pavan.foodies_backend.dto.UserRequest;
import com.pavan.foodies_backend.dto.UserResponse;

public interface UserService {

    UserResponse registerUser(UserRequest request);

    String findByUserId();
}
