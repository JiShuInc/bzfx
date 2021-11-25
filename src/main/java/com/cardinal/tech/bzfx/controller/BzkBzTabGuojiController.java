package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabGuojiService;
import com.cardinal.tech.bzfx.api.BzkBzTabGuojiApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 国籍(BzkBzTabGuoji)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:55
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabGuojiController implements BzkBzTabGuojiApi{

    private final BzkBzTabGuojiService bzkBzTabGuojiService;

    @Override
    public BzkBzTabGuojiService getService(){
        return bzkBzTabGuojiService;
     }
}