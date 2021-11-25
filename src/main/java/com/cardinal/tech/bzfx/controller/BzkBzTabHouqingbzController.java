package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabHouqingbzService;
import com.cardinal.tech.bzfx.api.BzkBzTabHouqingbzApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 后勤干部专业类别(BzkBzTabHouqingbz)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:55
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabHouqingbzController implements BzkBzTabHouqingbzApi{

    private final BzkBzTabHouqingbzService bzkBzTabHouqingbzService;

    @Override
    public BzkBzTabHouqingbzService getService(){
        return bzkBzTabHouqingbzService;
     }
}