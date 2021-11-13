package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.TjBeizhuangxxService;
import com.cardinal.tech.bzfx.api.TjBeizhuangxxApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 被装发放记录(TjBeizhuangxx)表控制层
 *
 * @author cadinal.tech
 * @since 2021-11-13 20:00:38
 */
@RequiredArgsConstructor
@RestController
public class TjBeizhuangxxController implements TjBeizhuangxxApi{

    private final TjBeizhuangxxService tjBeizhuangxxService;

    @Override
    public TjBeizhuangxxService getService(){
        return tjBeizhuangxxService;
     }
}