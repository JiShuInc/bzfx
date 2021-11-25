package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabBuduilbService;
import com.cardinal.tech.bzfx.api.BzkBzTabBuduilbApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 部队类别(BzkBzTabBuduilb)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:53
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabBuduilbController implements BzkBzTabBuduilbApi{

    private final BzkBzTabBuduilbService bzkBzTabBuduilbService;

    @Override
    public BzkBzTabBuduilbService getService(){
        return bzkBzTabBuduilbService;
     }
}