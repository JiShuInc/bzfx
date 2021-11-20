package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkTabDanweibclrxxService;
import com.cardinal.tech.bzfx.api.BzkTabDanweibclrxxApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 单位补充录入信息(BzkTabDanweibclrxx)表控制层
 *
 * @author makejava
 * @since 2021-11-20 16:06:13
 */
@RequiredArgsConstructor
@RestController
public class BzkTabDanweibclrxxController implements BzkTabDanweibclrxxApi{

    private final BzkTabDanweibclrxxService bzkTabDanweibclrxxService;

    @Override
    public BzkTabDanweibclrxxService getService(){
        return bzkTabDanweibclrxxService;
     }
}