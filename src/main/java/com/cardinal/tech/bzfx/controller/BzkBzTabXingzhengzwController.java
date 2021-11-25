package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabXingzhengzwService;
import com.cardinal.tech.bzfx.api.BzkBzTabXingzhengzwApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 行政职务(BzkBzTabXingzhengzw)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabXingzhengzwController implements BzkBzTabXingzhengzwApi{

    private final BzkBzTabXingzhengzwService bzkBzTabXingzhengzwService;

    @Override
    public BzkBzTabXingzhengzwService getService(){
        return bzkBzTabXingzhengzwService;
     }
}