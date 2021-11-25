package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabGangweilbService;
import com.cardinal.tech.bzfx.api.BzkBzTabGangweilbApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 岗位类别(BzkBzTabGangweilb)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:55
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabGangweilbController implements BzkBzTabGangweilbApi{

    private final BzkBzTabGangweilbService bzkBzTabGangweilbService;

    @Override
    public BzkBzTabGangweilbService getService(){
        return bzkBzTabGangweilbService;
     }
}