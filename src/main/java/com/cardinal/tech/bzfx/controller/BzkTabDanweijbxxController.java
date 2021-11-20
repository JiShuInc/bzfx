package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkTabDanweijbxxService;
import com.cardinal.tech.bzfx.api.BzkTabDanweijbxxApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 单位基本信息(BzkTabDanweijbxx)表控制层
 *
 * @author makejava
 * @since 2021-11-20 16:06:13
 */
@RequiredArgsConstructor
@RestController
public class BzkTabDanweijbxxController implements BzkTabDanweijbxxApi{

    private final BzkTabDanweijbxxService bzkTabDanweijbxxService;

    @Override
    public BzkTabDanweijbxxService getService(){
        return bzkTabDanweijbxxService;
     }
}