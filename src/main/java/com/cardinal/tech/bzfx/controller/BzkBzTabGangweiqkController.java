package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabGangweiqkService;
import com.cardinal.tech.bzfx.api.BzkBzTabGangweiqkApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 岗位情况标准编码(BzkBzTabGangweiqk)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:55
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabGangweiqkController implements BzkBzTabGangweiqkApi{

    private final BzkBzTabGangweiqkService bzkBzTabGangweiqkService;

    @Override
    public BzkBzTabGangweiqkService getService(){
        return bzkBzTabGangweiqkService;
     }
}