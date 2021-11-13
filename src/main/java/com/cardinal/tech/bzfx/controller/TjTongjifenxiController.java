package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.TjTongjifenxiService;
import com.cardinal.tech.bzfx.api.TjTongjifenxiApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 统计分析表(TjTongjifenxi)表控制层
 *
 * @author cadinal.tech
 * @since 2021-11-13 20:00:38
 */
@RequiredArgsConstructor
@RestController
public class TjTongjifenxiController implements TjTongjifenxiApi{

    private final TjTongjifenxiService tjTongjifenxiService;

    @Override
    public TjTongjifenxiService getService(){
        return tjTongjifenxiService;
     }
}