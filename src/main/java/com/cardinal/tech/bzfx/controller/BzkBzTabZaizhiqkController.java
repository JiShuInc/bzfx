package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabZaizhiqkService;
import com.cardinal.tech.bzfx.api.BzkBzTabZaizhiqkApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 在职情况标准表(BzkBzTabZaizhiqk)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabZaizhiqkController implements BzkBzTabZaizhiqkApi{

    private final BzkBzTabZaizhiqkService bzkBzTabZaizhiqkService;

    @Override
    public BzkBzTabZaizhiqkService getService(){
        return bzkBzTabZaizhiqkService;
     }
}