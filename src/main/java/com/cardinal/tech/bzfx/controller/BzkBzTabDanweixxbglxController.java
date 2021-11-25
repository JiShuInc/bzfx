package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabDanweixxbglxService;
import com.cardinal.tech.bzfx.api.BzkBzTabDanweixxbglxApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 单位信息变更类型(BzkBzTabDanweixxbglx)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:54
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabDanweixxbglxController implements BzkBzTabDanweixxbglxApi{

    private final BzkBzTabDanweixxbglxService bzkBzTabDanweixxbglxService;

    @Override
    public BzkBzTabDanweixxbglxService getService(){
        return bzkBzTabDanweixxbglxService;
     }
}