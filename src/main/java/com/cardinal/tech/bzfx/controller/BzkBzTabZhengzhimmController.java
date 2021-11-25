package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabZhengzhimmService;
import com.cardinal.tech.bzfx.api.BzkBzTabZhengzhimmApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 政治面貌(BzkBzTabZhengzhimm)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabZhengzhimmController implements BzkBzTabZhengzhimmApi{

    private final BzkBzTabZhengzhimmService bzkBzTabZhengzhimmService;

    @Override
    public BzkBzTabZhengzhimmService getService(){
        return bzkBzTabZhengzhimmService;
     }
}