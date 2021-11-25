package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabQihouquService;
import com.cardinal.tech.bzfx.api.BzkBzTabQihouquApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 气候区(BzkBzTabQihouqu)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:57
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabQihouquController implements BzkBzTabQihouquApi{

    private final BzkBzTabQihouquService bzkBzTabQihouquService;

    @Override
    public BzkBzTabQihouquService getService(){
        return bzkBzTabQihouquService;
     }
}