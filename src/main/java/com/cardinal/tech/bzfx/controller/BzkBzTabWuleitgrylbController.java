package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabWuleitgrylbService;
import com.cardinal.tech.bzfx.api.BzkBzTabWuleitgrylbApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 五类特供人员类别(BzkBzTabWuleitgrylb)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabWuleitgrylbController implements BzkBzTabWuleitgrylbApi{

    private final BzkBzTabWuleitgrylbService bzkBzTabWuleitgrylbService;

    @Override
    public BzkBzTabWuleitgrylbService getService(){
        return bzkBzTabWuleitgrylbService;
     }
}