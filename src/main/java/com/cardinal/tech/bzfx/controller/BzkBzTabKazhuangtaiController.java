package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabKazhuangtaiService;
import com.cardinal.tech.bzfx.api.BzkBzTabKazhuangtaiApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 卡状态(BzkBzTabKazhuangtai)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:56
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabKazhuangtaiController implements BzkBzTabKazhuangtaiApi{

    private final BzkBzTabKazhuangtaiService bzkBzTabKazhuangtaiService;

    @Override
    public BzkBzTabKazhuangtaiService getService(){
        return bzkBzTabKazhuangtaiService;
     }
}