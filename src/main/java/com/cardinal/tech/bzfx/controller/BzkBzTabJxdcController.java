package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabJxdcService;
import com.cardinal.tech.bzfx.api.BzkBzTabJxdcApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 军衔档次(BzkBzTabJxdc)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:56
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabJxdcController implements BzkBzTabJxdcApi{

    private final BzkBzTabJxdcService bzkBzTabJxdcService;

    @Override
    public BzkBzTabJxdcService getService(){
        return bzkBzTabJxdcService;
     }
}