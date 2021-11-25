package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabDanweiztService;
import com.cardinal.tech.bzfx.api.BzkBzTabDanweiztApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 单位状态(BzkBzTabDanweizt)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:54
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabDanweiztController implements BzkBzTabDanweiztApi{

    private final BzkBzTabDanweiztService bzkBzTabDanweiztService;

    @Override
    public BzkBzTabDanweiztService getService(){
        return bzkBzTabDanweiztService;
     }
}