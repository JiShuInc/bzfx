package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabJunrenrylbService;
import com.cardinal.tech.bzfx.api.BzkBzTabJunrenrylbApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 军人人员类别(BzkBzTabJunrenrylb)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:56
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabJunrenrylbController implements BzkBzTabJunrenrylbApi{

    private final BzkBzTabJunrenrylbService bzkBzTabJunrenrylbService;

    @Override
    public BzkBzTabJunrenrylbService getService(){
        return bzkBzTabJunrenrylbService;
     }
}