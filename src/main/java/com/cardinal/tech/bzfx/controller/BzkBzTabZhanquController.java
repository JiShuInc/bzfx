package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabZhanquService;
import com.cardinal.tech.bzfx.api.BzkBzTabZhanquApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 战区(BzkBzTabZhanqu)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabZhanquController implements BzkBzTabZhanquApi{

    private final BzkBzTabZhanquService bzkBzTabZhanquService;

    @Override
    public BzkBzTabZhanquService getService(){
        return bzkBzTabZhanquService;
     }
}