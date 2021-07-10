package com.ife.develeper.server.controller;

import com.ife.develeper.server.dao.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestUserController {

    private final UserRepository userRepository;

    RestUserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }
}
