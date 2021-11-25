package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabSanleitgrylbService;
import com.cardinal.tech.bzfx.api.BzkBzTabSanleitgrylbApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 三类特供人员类别(BzkBzTabSanleitgrylb)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabSanleitgrylbController implements BzkBzTabSanleitgrylbApi{

    private final BzkBzTabSanleitgrylbService bzkBzTabSanleitgrylbService;

    @Override
    public BzkBzTabSanleitgrylbService getService(){
        return bzkBzTabSanleitgrylbService;
     }
}