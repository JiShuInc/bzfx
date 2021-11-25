package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabKaohejgService;
import com.cardinal.tech.bzfx.api.BzkBzTabKaohejgApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 考核结果标准编码(BzkBzTabKaohejg)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:56
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabKaohejgController implements BzkBzTabKaohejgApi{

    private final BzkBzTabKaohejgService bzkBzTabKaohejgService;

    @Override
    public BzkBzTabKaohejgService getService(){
        return bzkBzTabKaohejgService;
     }
}