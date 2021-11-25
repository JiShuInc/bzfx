package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabXingbieService;
import com.cardinal.tech.bzfx.api.BzkBzTabXingbieApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 性别(BzkBzTabXingbie)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabXingbieController implements BzkBzTabXingbieApi{

    private final BzkBzTabXingbieService bzkBzTabXingbieService;

    @Override
    public BzkBzTabXingbieService getService(){
        return bzkBzTabXingbieService;
     }
}