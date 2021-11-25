package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabZhuleibieService;
import com.cardinal.tech.bzfx.api.BzkBzTabZhuleibieApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 主类别(BzkBzTabZhuleibie)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:59
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabZhuleibieController implements BzkBzTabZhuleibieApi{

    private final BzkBzTabZhuleibieService bzkBzTabZhuleibieService;

    @Override
    public BzkBzTabZhuleibieService getService(){
        return bzkBzTabZhuleibieService;
     }
}