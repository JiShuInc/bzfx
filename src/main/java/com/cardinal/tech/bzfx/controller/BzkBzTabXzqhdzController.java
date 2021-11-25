package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabXzqhdzService;
import com.cardinal.tech.bzfx.api.BzkBzTabXzqhdzApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 行政区划对照(BzkBzTabXzqhdz)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabXzqhdzController implements BzkBzTabXzqhdzApi{

    private final BzkBzTabXzqhdzService bzkBzTabXzqhdzService;

    @Override
    public BzkBzTabXzqhdzService getService(){
        return bzkBzTabXzqhdzService;
     }
}