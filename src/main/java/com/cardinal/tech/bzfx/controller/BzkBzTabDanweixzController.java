package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabDanweixzService;
import com.cardinal.tech.bzfx.api.BzkBzTabDanweixzApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 单位性质(BzkBzTabDanweixz)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:54
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabDanweixzController implements BzkBzTabDanweixzApi{

    private final BzkBzTabDanweixzService bzkBzTabDanweixzService;

    @Override
    public BzkBzTabDanweixzService getService(){
        return bzkBzTabDanweixzService;
     }
}