package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabDwxxdzService;
import com.cardinal.tech.bzfx.api.BzkBzTabDwxxdzApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 单位信息对照(BzkBzTabDwxxdz)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:55
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabDwxxdzController implements BzkBzTabDwxxdzApi{

    private final BzkBzTabDwxxdzService bzkBzTabDwxxdzService;

    @Override
    public BzkBzTabDwxxdzService getService(){
        return bzkBzTabDwxxdzService;
     }
}