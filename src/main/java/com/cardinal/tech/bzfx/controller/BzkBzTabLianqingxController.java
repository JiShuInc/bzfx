package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabLianqingxService;
import com.cardinal.tech.bzfx.api.BzkBzTabLianqingxApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 联勤关系(BzkBzTabLianqingx)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:56
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabLianqingxController implements BzkBzTabLianqingxApi{

    private final BzkBzTabLianqingxService bzkBzTabLianqingxService;

    @Override
    public BzkBzTabLianqingxService getService(){
        return bzkBzTabLianqingxService;
     }
}