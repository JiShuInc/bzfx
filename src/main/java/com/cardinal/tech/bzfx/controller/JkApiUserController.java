package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.JkApiUserService;
import com.cardinal.tech.bzfx.api.JkApiUserApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * (JkApiUser)表控制层
 *
 * @author makejava
 * @since 2021-11-20 19:22:42
 */
@RequiredArgsConstructor
@RestController
public class JkApiUserController implements JkApiUserApi{

    private final JkApiUserService jkApiUserService;

    @Override
    public JkApiUserService getService(){
        return jkApiUserService;
     }
}