package com.eshop.statyba.controller;

import com.eshop.statyba.dto.CreateUserDto;
import com.eshop.statyba.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import static com.eshop.statyba.config.ApiPaths.CREATEUSER;
import static com.eshop.statyba.config.ApiPaths.ROOT;


@RestController
@RequestMapping(ROOT + CREATEUSER)
public class UserController {

    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public void createUser(@RequestBody CreateUserDto createUserDto) {
        userService.createNewUser(createUserDto);
    }

}
