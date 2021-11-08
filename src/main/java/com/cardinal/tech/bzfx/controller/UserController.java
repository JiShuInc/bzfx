package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.config.controller.BaseController;
import com.cardinal.tech.bzfx.service.UserService;
import com.cardinal.tech.bzfx.api.BackUserApi;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController extends BaseController implements BackUserApi {
    private UserService userService;

    public UserController(UserService userService, UserService userService1) {
        super(userService);
        this.userService = userService1;
    }

    @Override
    public UserService getUserService() {
        return this.userService;
    }
}
