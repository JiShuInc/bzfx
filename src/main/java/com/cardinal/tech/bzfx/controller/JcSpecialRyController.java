package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.JcSpecialRyService;
import com.cardinal.tech.bzfx.api.JcSpecialRyApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 专项任务人员(JcSpecialRy)表控制层
 *
 * @author cadinal.tech
 * @since 2021-11-13 20:00:37
 */
@RequiredArgsConstructor
@RestController
public class JcSpecialRyController implements JcSpecialRyApi{

    private final JcSpecialRyService jcSpecialRyService;

    @Override
    public JcSpecialRyService getService(){
        return jcSpecialRyService;
     }
}