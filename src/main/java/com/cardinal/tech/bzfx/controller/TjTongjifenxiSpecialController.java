package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.TjTongjifenxiSpecialService;
import com.cardinal.tech.bzfx.api.TjTongjifenxiSpecialApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 专项任务统计分析表(TjTongjifenxiSpecial)表控制层
 *
 * @author makejava
 * @since 2021-12-04 19:29:47
 */
@RequiredArgsConstructor
@RestController
public class TjTongjifenxiSpecialController implements TjTongjifenxiSpecialApi{

    private final TjTongjifenxiSpecialService tjTongjifenxiSpecialService;

    @Override
    public TjTongjifenxiSpecialService getService(){
        return tjTongjifenxiSpecialService;
     }
}