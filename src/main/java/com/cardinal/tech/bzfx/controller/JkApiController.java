package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.JkApiService;
import com.cardinal.tech.bzfx.api.JkApiApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 接口(JkApi)表控制层
 *
 * @author cadinal.tech
 * @since 2021-11-13 19:28:46
 */
@RequiredArgsConstructor
@RestController
public class JkApiController implements JkApiApi{

    private final JkApiService jkApiService;

    @Override
    public JkApiService getService(){
        return jkApiService;
     }
}