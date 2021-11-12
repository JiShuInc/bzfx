package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.TjZhuangaiwzService;
import com.cardinal.tech.bzfx.api.TjZhuangaiwzApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 军官和文职干部互改记录表(TjZhuangaiwz)表控制层
 *
 * @author cadinal.tech
 * @since 2021-11-13 01:33:38
 */
@RequiredArgsConstructor
@RestController
public class TjZhuangaiwzController implements TjZhuangaiwzApi{

    private final TjZhuangaiwzService tjZhuangaiwzService;

    @Override
    public TjZhuangaiwzService getService(){
        return tjZhuangaiwzService;
     }
}