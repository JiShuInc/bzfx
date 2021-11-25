package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabZhigongsfService;
import com.cardinal.tech.bzfx.api.BzkBzTabZhigongsfApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 职工身份类别(BzkBzTabZhigongsf)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabZhigongsfController implements BzkBzTabZhigongsfApi{

    private final BzkBzTabZhigongsfService bzkBzTabZhigongsfService;

    @Override
    public BzkBzTabZhigongsfService getService(){
        return bzkBzTabZhigongsfService;
     }
}