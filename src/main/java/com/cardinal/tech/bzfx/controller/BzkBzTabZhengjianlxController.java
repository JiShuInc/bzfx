package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabZhengjianlxService;
import com.cardinal.tech.bzfx.api.BzkBzTabZhengjianlxApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 证件类型(BzkBzTabZhengjianlx)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabZhengjianlxController implements BzkBzTabZhengjianlxApi{

    private final BzkBzTabZhengjianlxService bzkBzTabZhengjianlxService;

    @Override
    public BzkBzTabZhengjianlxService getService(){
        return bzkBzTabZhengjianlxService;
     }
}