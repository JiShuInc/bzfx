package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabCwdyrylbService;
import com.cardinal.tech.bzfx.api.BzkBzTabCwdyrylbApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 财务待遇人员类别(BzkBzTabCwdyrylb)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:54
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabCwdyrylbController implements BzkBzTabCwdyrylbApi{

    private final BzkBzTabCwdyrylbService bzkBzTabCwdyrylbService;

    @Override
    public BzkBzTabCwdyrylbService getService(){
        return bzkBzTabCwdyrylbService;
     }
}