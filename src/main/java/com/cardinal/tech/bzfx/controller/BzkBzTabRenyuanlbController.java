package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabRenyuanlbService;
import com.cardinal.tech.bzfx.api.BzkBzTabRenyuanlbApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 人员类别(BzkBzTabRenyuanlb)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:57
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabRenyuanlbController implements BzkBzTabRenyuanlbApi{

    private final BzkBzTabRenyuanlbService bzkBzTabRenyuanlbService;

    @Override
    public BzkBzTabRenyuanlbService getService(){
        return bzkBzTabRenyuanlbService;
     }
}