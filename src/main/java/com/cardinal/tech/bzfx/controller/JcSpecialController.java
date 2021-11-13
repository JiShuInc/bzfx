package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.JcSpecialService;
import com.cardinal.tech.bzfx.api.JcSpecialApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 专项任务(JcSpecial)表控制层
 *
 * @author cadinal.tech
 * @since 2021-11-13 20:00:37
 */
@RequiredArgsConstructor
@RestController
public class JcSpecialController implements JcSpecialApi{

    private final JcSpecialService jcSpecialService;

    @Override
    public JcSpecialService getService(){
        return jcSpecialService;
     }
}