package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.config.controller.BaseController;
import com.cardinal.tech.bzfx.service.JkApiUserService;
import com.cardinal.tech.bzfx.service.UserService;
import com.cardinal.tech.bzfx.api.BackUserApi;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController extends BaseController implements BackUserApi {
    private final UserService userService;

    public UserController(UserService userService, JkApiUserService apiUserService) {
        super(userService, apiUserService);
        this.userService = userService;
    }

    @Override
    public UserService getUserService() {
        return this.userService;
    }
}
