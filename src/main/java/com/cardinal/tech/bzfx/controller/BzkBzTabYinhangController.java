package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabYinhangService;
import com.cardinal.tech.bzfx.api.BzkBzTabYinhangApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 银行代码(BzkBzTabYinhang)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabYinhangController implements BzkBzTabYinhangApi{

    private final BzkBzTabYinhangService bzkBzTabYinhangService;

    @Override
    public BzkBzTabYinhangService getService(){
        return bzkBzTabYinhangService;
     }
}