package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabDaiyujbdcService;
import com.cardinal.tech.bzfx.api.BzkBzTabDaiyujbdcApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 待遇级别档次标准编码(BzkBzTabDaiyujbdc)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:54
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabDaiyujbdcController implements BzkBzTabDaiyujbdcApi{

    private final BzkBzTabDaiyujbdcService bzkBzTabDaiyujbdcService;

    @Override
    public BzkBzTabDaiyujbdcService getService(){
        return bzkBzTabDaiyujbdcService;
     }
}