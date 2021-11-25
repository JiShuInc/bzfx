package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabBukalxService;
import com.cardinal.tech.bzfx.api.BzkBzTabBukalxApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 补卡类型(BzkBzTabBukalx)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:53
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabBukalxController implements BzkBzTabBukalxApi{

    private final BzkBzTabBukalxService bzkBzTabBukalxService;

    @Override
    public BzkBzTabBukalxService getService(){
        return bzkBzTabBukalxService;
     }
}