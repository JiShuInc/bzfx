package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabDimingService;
import com.cardinal.tech.bzfx.api.BzkBzTabDimingApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 地名(BzkBzTabDiming)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:54
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabDimingController implements BzkBzTabDimingApi{

    private final BzkBzTabDimingService bzkBzTabDimingService;

    @Override
    public BzkBzTabDimingService getService(){
        return bzkBzTabDimingService;
     }
}