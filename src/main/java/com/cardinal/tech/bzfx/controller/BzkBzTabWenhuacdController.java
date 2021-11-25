package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabWenhuacdService;
import com.cardinal.tech.bzfx.api.BzkBzTabWenhuacdApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 文化程度(BzkBzTabWenhuacd)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabWenhuacdController implements BzkBzTabWenhuacdApi{

    private final BzkBzTabWenhuacdService bzkBzTabWenhuacdService;

    @Override
    public BzkBzTabWenhuacdService getService(){
        return bzkBzTabWenhuacdService;
     }
}