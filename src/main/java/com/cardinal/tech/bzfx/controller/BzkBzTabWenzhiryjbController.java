package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabWenzhiryjbService;
import com.cardinal.tech.bzfx.api.BzkBzTabWenzhiryjbApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 文职人员级别(BzkBzTabWenzhiryjb)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabWenzhiryjbController implements BzkBzTabWenzhiryjbApi{

    private final BzkBzTabWenzhiryjbService bzkBzTabWenzhiryjbService;

    @Override
    public BzkBzTabWenzhiryjbService getService(){
        return bzkBzTabWenzhiryjbService;
     }
}