package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabZnzkService;
import com.cardinal.tech.bzfx.api.BzkBzTabZnzkApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 子女状况(BzkBzTabZnzk)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:59
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabZnzkController implements BzkBzTabZnzkApi{

    private final BzkBzTabZnzkService bzkBzTabZnzkService;

    @Override
    public BzkBzTabZnzkService getService(){
        return bzkBzTabZnzkService;
     }
}