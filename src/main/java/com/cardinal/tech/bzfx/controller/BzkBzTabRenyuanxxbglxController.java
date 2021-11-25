package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabRenyuanxxbglxService;
import com.cardinal.tech.bzfx.api.BzkBzTabRenyuanxxbglxApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 人员信息变更类型(BzkBzTabRenyuanxxbglx)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:57
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabRenyuanxxbglxController implements BzkBzTabRenyuanxxbglxApi{

    private final BzkBzTabRenyuanxxbglxService bzkBzTabRenyuanxxbglxService;

    @Override
    public BzkBzTabRenyuanxxbglxService getService(){
        return bzkBzTabRenyuanxxbglxService;
     }
}