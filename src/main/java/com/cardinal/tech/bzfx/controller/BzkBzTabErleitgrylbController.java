package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabErleitgrylbService;
import com.cardinal.tech.bzfx.api.BzkBzTabErleitgrylbApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 二类特供人员类别(BzkBzTabErleitgrylb)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:55
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabErleitgrylbController implements BzkBzTabErleitgrylbApi{

    private final BzkBzTabErleitgrylbService bzkBzTabErleitgrylbService;

    @Override
    public BzkBzTabErleitgrylbService getService(){
        return bzkBzTabErleitgrylbService;
     }
}