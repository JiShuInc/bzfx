package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.TjZhufangService;
import com.cardinal.tech.bzfx.api.TjZhufangApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 人员住房情况(TjZhufang)表控制层
 *
 * @author cadinal.tech
 * @since 2021-11-13 20:00:38
 */
@RequiredArgsConstructor
@RestController
public class TjZhufangController implements TjZhufangApi{

    private final TjZhufangService tjZhufangService;

    @Override
    public TjZhufangService getService(){
        return tjZhufangService;
     }
}