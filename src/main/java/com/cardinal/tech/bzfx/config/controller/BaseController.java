package com.cardinal.tech.bzfx.config.controller;

import com.cardinal.tech.bzfx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static com.cardinal.tech.bzfx.constants.Constant.USER_ID;

public abstract class BaseController {
    @Autowired
    protected HttpServletRequest request;
    @Autowired
    protected HttpServletResponse response;

    private final UserService userService;

    protected BaseController(UserService userService) {
        this.userService = userService;
    }

    public Integer getUserId() {
        String userId = (String) request.getAttribute(USER_ID);
        return null != userId ? Integer.valueOf(userId) : null;
    }

    public UserService getUserService() {
        return this.userService;
    }
}
