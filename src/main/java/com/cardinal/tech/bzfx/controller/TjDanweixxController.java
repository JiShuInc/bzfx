package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.TjDanweixxService;
import com.cardinal.tech.bzfx.api.TjDanweixxApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 单位信息表(TjDanweixx)表控制层
 *
 * @author cadinal.tech
 * @since 2021-11-13 19:28:47
 */
@RequiredArgsConstructor
@RestController
public class TjDanweixxController implements TjDanweixxApi{

    private final TjDanweixxService tjDanweixxService;

    @Override
    public TjDanweixxService getService(){
        return tjDanweixxService;
     }
}