package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabHunyinzkService;
import com.cardinal.tech.bzfx.api.BzkBzTabHunyinzkApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 婚姻状况(BzkBzTabHunyinzk)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:56
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabHunyinzkController implements BzkBzTabHunyinzkApi{

    private final BzkBzTabHunyinzkService bzkBzTabHunyinzkService;

    @Override
    public BzkBzTabHunyinzkService getService(){
        return bzkBzTabHunyinzkService;
     }
}