package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.TjBaozhangkajlService;
import com.cardinal.tech.bzfx.api.TjBaozhangkajlApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 保障卡卡记录表(TjBaozhangkajl)表控制层
 *
 * @author cadinal.tech
 * @since 2021-11-13 19:28:47
 */
@RequiredArgsConstructor
@RestController
public class TjBaozhangkajlController implements TjBaozhangkajlApi{

    private final TjBaozhangkajlService tjBaozhangkajlService;

    @Override
    public TjBaozhangkajlService getService(){
        return tjBaozhangkajlService;
     }
}