package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabScdjService;
import com.cardinal.tech.bzfx.api.BzkBzTabScdjApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 伤残等级(BzkBzTabScdj)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabScdjController implements BzkBzTabScdjApi{

    private final BzkBzTabScdjService bzkBzTabScdjService;

    @Override
    public BzkBzTabScdjService getService(){
        return bzkBzTabScdjService;
     }
}