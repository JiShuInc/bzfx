package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabJingjizkService;
import com.cardinal.tech.bzfx.api.BzkBzTabJingjizkApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 经济状况(BzkBzTabJingjizk)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:56
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabJingjizkController implements BzkBzTabJingjizkApi{

    private final BzkBzTabJingjizkService bzkBzTabJingjizkService;

    @Override
    public BzkBzTabJingjizkService getService(){
        return bzkBzTabJingjizkService;
     }
}