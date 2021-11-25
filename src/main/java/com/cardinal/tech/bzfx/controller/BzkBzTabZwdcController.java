package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabZwdcService;
import com.cardinal.tech.bzfx.api.BzkBzTabZwdcApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 职务档次(BzkBzTabZwdc)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:59
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabZwdcController implements BzkBzTabZwdcApi{

    private final BzkBzTabZwdcService bzkBzTabZwdcService;

    @Override
    public BzkBzTabZwdcService getService(){
        return bzkBzTabZwdcService;
     }
}