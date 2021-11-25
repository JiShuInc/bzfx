package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabJiguanfdbService;
import com.cardinal.tech.bzfx.api.BzkBzTabJiguanfdbApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 机关分队标识(BzkBzTabJiguanfdb)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:56
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabJiguanfdbController implements BzkBzTabJiguanfdbApi{

    private final BzkBzTabJiguanfdbService bzkBzTabJiguanfdbService;

    @Override
    public BzkBzTabJiguanfdbService getService(){
        return bzkBzTabJiguanfdbService;
     }
}