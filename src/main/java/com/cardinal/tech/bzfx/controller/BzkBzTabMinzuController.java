package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabMinzuService;
import com.cardinal.tech.bzfx.api.BzkBzTabMinzuApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 民族(BzkBzTabMinzu)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:56
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabMinzuController implements BzkBzTabMinzuApi{

    private final BzkBzTabMinzuService bzkBzTabMinzuService;

    @Override
    public BzkBzTabMinzuService getService(){
        return bzkBzTabMinzuService;
     }
}