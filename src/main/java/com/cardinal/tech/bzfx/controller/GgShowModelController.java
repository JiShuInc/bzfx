package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.GgShowModelService;
import com.cardinal.tech.bzfx.api.GgShowModelApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 可视化模型(GgShowModel)表控制层
 *
 * @author cadinal.tech
 * @since 2021-11-14 14:09:12
 */
@RequiredArgsConstructor
@RestController
public class GgShowModelController implements GgShowModelApi{

    private final GgShowModelService ggShowModelService;

    @Override
    public GgShowModelService getService(){
        return ggShowModelService;
     }
}