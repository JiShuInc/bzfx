package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkTabBaozhangkjbxxService;
import com.cardinal.tech.bzfx.api.BzkTabBaozhangkjbxxApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 保障卡基本信息(BzkTabBaozhangkjbxx)表控制层
 *
 * @author makejava
 * @since 2021-11-20 16:06:13
 */
@RequiredArgsConstructor
@RestController
public class BzkTabBaozhangkjbxxController implements BzkTabBaozhangkjbxxApi{

    private final BzkTabBaozhangkjbxxService bzkTabBaozhangkjbxxService;

    @Override
    public BzkTabBaozhangkjbxxService getService(){
        return bzkTabBaozhangkjbxxService;
     }
}