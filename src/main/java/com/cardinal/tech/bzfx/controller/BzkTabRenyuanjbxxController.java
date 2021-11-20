package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkTabRenyuanjbxxService;
import com.cardinal.tech.bzfx.api.BzkTabRenyuanjbxxApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 人员基本信息(BzkTabRenyuanjbxx)表控制层
 *
 * @author makejava
 * @since 2021-11-20 16:06:13
 */
@RequiredArgsConstructor
@RestController
public class BzkTabRenyuanjbxxController implements BzkTabRenyuanjbxxApi{

    private final BzkTabRenyuanjbxxService bzkTabRenyuanjbxxService;

    @Override
    public BzkTabRenyuanjbxxService getService(){
        return bzkTabRenyuanjbxxService;
     }
}