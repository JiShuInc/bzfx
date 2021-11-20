package com.cardinal.tech.bzfx.api;

import com.cardinal.tech.bzfx.service.JkApiUserService;
import com.cardinal.tech.bzfx.service.UserService;

public interface BaseApi {
    UserService getUserService();

    Integer getUserId();

    boolean checkApiAccess(Integer apiId);
}
