package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabDaiyujbService;
import com.cardinal.tech.bzfx.api.BzkBzTabDaiyujbApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 待遇级别标准编码(BzkBzTabDaiyujb)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:54
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabDaiyujbController implements BzkBzTabDaiyujbApi{

    private final BzkBzTabDaiyujbService bzkBzTabDaiyujbService;

    @Override
    public BzkBzTabDaiyujbService getService(){
        return bzkBzTabDaiyujbService;
     }
}