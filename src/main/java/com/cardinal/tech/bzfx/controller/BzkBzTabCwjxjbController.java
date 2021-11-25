package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabCwjxjbService;
import com.cardinal.tech.bzfx.api.BzkBzTabCwjxjbApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 军衔(BzkBzTabCwjxjb)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:54
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabCwjxjbController implements BzkBzTabCwjxjbApi{

    private final BzkBzTabCwjxjbService bzkBzTabCwjxjbService;

    @Override
    public BzkBzTabCwjxjbService getService(){
        return bzkBzTabCwjxjbService;
     }
}