package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabXueweiService;
import com.cardinal.tech.bzfx.api.BzkBzTabXueweiApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 学位(BzkBzTabXuewei)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabXueweiController implements BzkBzTabXueweiApi{

    private final BzkBzTabXueweiService bzkBzTabXueweiService;

    @Override
    public BzkBzTabXueweiService getService(){
        return bzkBzTabXueweiService;
     }
}