package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.TjDapingshezhiService;
import com.cardinal.tech.bzfx.api.TjDapingshezhiApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * (TjDapingshezhi)表控制层
 *
 * @author makejava
 * @since 2021-12-07 10:48:02
 */
@RequiredArgsConstructor
@RestController
public class TjDapingshezhiController implements TjDapingshezhiApi{

    private final TjDapingshezhiService tjDapingshezhiService;

    @Override
    public TjDapingshezhiService getService(){
        return tjDapingshezhiService;
     }
}