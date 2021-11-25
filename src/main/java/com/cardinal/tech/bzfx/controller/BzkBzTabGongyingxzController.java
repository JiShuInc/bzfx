package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabGongyingxzService;
import com.cardinal.tech.bzfx.api.BzkBzTabGongyingxzApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 供应性质(BzkBzTabGongyingxz)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:55
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabGongyingxzController implements BzkBzTabGongyingxzApi{

    private final BzkBzTabGongyingxzService bzkBzTabGongyingxzService;

    @Override
    public BzkBzTabGongyingxzService getService(){
        return bzkBzTabGongyingxzService;
     }
}