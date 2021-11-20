package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkSlgxCwCwbzsjService;
import com.cardinal.tech.bzfx.api.BzkSlgxCwCwbzsjApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 财务保障数据(BzkSlgxCwCwbzsj)表控制层
 *
 * @author makejava
 * @since 2021-11-20 16:06:13
 */
@RequiredArgsConstructor
@RestController
public class BzkSlgxCwCwbzsjController implements BzkSlgxCwCwbzsjApi{

    private final BzkSlgxCwCwbzsjService bzkSlgxCwCwbzsjService;

    @Override
    public BzkSlgxCwCwbzsjService getService(){
        return bzkSlgxCwCwbzsjService;
     }
}