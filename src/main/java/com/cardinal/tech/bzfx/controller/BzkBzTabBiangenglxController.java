package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabBiangenglxService;
import com.cardinal.tech.bzfx.api.BzkBzTabBiangenglxApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 变更类型标准表(BzkBzTabBiangenglx)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:53
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabBiangenglxController implements BzkBzTabBiangenglxApi{

    private final BzkBzTabBiangenglxService bzkBzTabBiangenglxService;

    @Override
    public BzkBzTabBiangenglxService getService(){
        return bzkBzTabBiangenglxService;
     }
}