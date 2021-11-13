package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.TjBeizhuangffService;
import com.cardinal.tech.bzfx.api.TjBeizhuangffApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 被装发放记录(TjBeizhuangff)表控制层
 *
 * @author cadinal.tech
 * @since 2021-11-13 19:28:47
 */
@RequiredArgsConstructor
@RestController
public class TjBeizhuangffController implements TjBeizhuangffApi{

    private final TjBeizhuangffService tjBeizhuangffService;

    @Override
    public TjBeizhuangffService getService(){
        return tjBeizhuangffService;
     }
}