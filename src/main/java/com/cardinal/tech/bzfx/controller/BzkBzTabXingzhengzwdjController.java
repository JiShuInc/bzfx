package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabXingzhengzwdjService;
import com.cardinal.tech.bzfx.api.BzkBzTabXingzhengzwdjApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 行政职务等级(BzkBzTabXingzhengzwdj)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabXingzhengzwdjController implements BzkBzTabXingzhengzwdjApi{

    private final BzkBzTabXingzhengzwdjService bzkBzTabXingzhengzwdjService;

    @Override
    public BzkBzTabXingzhengzwdjService getService(){
        return bzkBzTabXingzhengzwdjService;
     }
}