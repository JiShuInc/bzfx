package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabHouqinbdlService;
import com.cardinal.tech.bzfx.api.BzkBzTabHouqinbdlApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 后勤部队类别(BzkBzTabHouqinbdl)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:55
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabHouqinbdlController implements BzkBzTabHouqinbdlApi{

    private final BzkBzTabHouqinbdlService bzkBzTabHouqinbdlService;

    @Override
    public BzkBzTabHouqinbdlService getService(){
        return bzkBzTabHouqinbdlService;
     }
}