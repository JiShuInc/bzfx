package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabBukaztService;
import com.cardinal.tech.bzfx.api.BzkBzTabBukaztApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 补卡状态(BzkBzTabBukazt)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:53
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabBukaztController implements BzkBzTabBukaztApi{

    private final BzkBzTabBukaztService bzkBzTabBukaztService;

    @Override
    public BzkBzTabBukaztService getService(){
        return bzkBzTabBukaztService;
     }
}