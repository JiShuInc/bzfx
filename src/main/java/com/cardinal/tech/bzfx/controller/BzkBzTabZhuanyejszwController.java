package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabZhuanyejszwService;
import com.cardinal.tech.bzfx.api.BzkBzTabZhuanyejszwApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 专业技术职务(BzkBzTabZhuanyejszw)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabZhuanyejszwController implements BzkBzTabZhuanyejszwApi{

    private final BzkBzTabZhuanyejszwService bzkBzTabZhuanyejszwService;

    @Override
    public BzkBzTabZhuanyejszwService getService(){
        return bzkBzTabZhuanyejszwService;
     }
}