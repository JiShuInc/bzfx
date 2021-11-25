package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabGuominshiService;
import com.cardinal.tech.bzfx.api.BzkBzTabGuominshiApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 过敏史字典表(BzkBzTabGuominshi)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:55
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabGuominshiController implements BzkBzTabGuominshiApi{

    private final BzkBzTabGuominshiService bzkBzTabGuominshiService;

    @Override
    public BzkBzTabGuominshiService getService(){
        return bzkBzTabGuominshiService;
     }
}