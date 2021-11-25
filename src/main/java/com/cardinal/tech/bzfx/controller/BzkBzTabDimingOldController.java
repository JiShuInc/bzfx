package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabDimingOldService;
import com.cardinal.tech.bzfx.api.BzkBzTabDimingOldApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * (BzkBzTabDimingOld)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:44:40
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabDimingOldController implements BzkBzTabDimingOldApi{

    private final BzkBzTabDimingOldService bzkBzTabDimingOldService;

    @Override
    public BzkBzTabDimingOldService getService(){
        return bzkBzTabDimingOldService;
     }
}