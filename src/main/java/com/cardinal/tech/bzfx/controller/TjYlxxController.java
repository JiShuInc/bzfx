package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.TjYlxxService;
import com.cardinal.tech.bzfx.api.TjYlxxApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 医疗信息(TjYlxx)表控制层
 *
 * @author cadinal.tech
 * @since 2021-11-13 19:28:47
 */
@RequiredArgsConstructor
@RestController
public class TjYlxxController implements TjYlxxApi{

    private final TjYlxxService tjYlxxService;

    @Override
    public TjYlxxService getService(){
        return tjYlxxService;
     }
}