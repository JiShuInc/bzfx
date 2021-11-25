package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabYileitgrylbService;
import com.cardinal.tech.bzfx.api.BzkBzTabYileitgrylbApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 一类特供人员类别(BzkBzTabYileitgrylb)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabYileitgrylbController implements BzkBzTabYileitgrylbApi{

    private final BzkBzTabYileitgrylbService bzkBzTabYileitgrylbService;

    @Override
    public BzkBzTabYileitgrylbService getService(){
        return bzkBzTabYileitgrylbService;
     }
}