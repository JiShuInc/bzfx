package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabGerenztService;
import com.cardinal.tech.bzfx.api.BzkBzTabGerenztApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 个人状态(BzkBzTabGerenzt)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:55
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabGerenztController implements BzkBzTabGerenztApi{

    private final BzkBzTabGerenztService bzkBzTabGerenztService;

    @Override
    public BzkBzTabGerenztService getService(){
        return bzkBzTabGerenztService;
     }
}