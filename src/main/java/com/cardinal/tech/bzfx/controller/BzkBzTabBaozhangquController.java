package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabBaozhangquService;
import com.cardinal.tech.bzfx.api.BzkBzTabBaozhangquApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 保障区(BzkBzTabBaozhangqu)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:53
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabBaozhangquController implements BzkBzTabBaozhangquApi{

    private final BzkBzTabBaozhangquService bzkBzTabBaozhangquService;

    @Override
    public BzkBzTabBaozhangquService getService(){
        return bzkBzTabBaozhangquService;
     }
}