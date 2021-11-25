package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabSileitgrylbService;
import com.cardinal.tech.bzfx.api.BzkBzTabSileitgrylbApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 四类特供人员类别(BzkBzTabSileitgrylb)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabSileitgrylbController implements BzkBzTabSileitgrylbApi{

    private final BzkBzTabSileitgrylbService bzkBzTabSileitgrylbService;

    @Override
    public BzkBzTabSileitgrylbService getService(){
        return bzkBzTabSileitgrylbService;
     }
}