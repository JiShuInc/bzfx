package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabQunuanlqService;
import com.cardinal.tech.bzfx.api.BzkBzTabQunuanlqApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 取暖类区(BzkBzTabQunuanlq)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:57
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabQunuanlqController implements BzkBzTabQunuanlqApi{

    private final BzkBzTabQunuanlqService bzkBzTabQunuanlqService;

    @Override
    public BzkBzTabQunuanlqService getService(){
        return bzkBzTabQunuanlqService;
     }
}