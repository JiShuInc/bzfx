package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabZhuanyejsdjService;
import com.cardinal.tech.bzfx.api.BzkBzTabZhuanyejsdjApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 专业技术等级(BzkBzTabZhuanyejsdj)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabZhuanyejsdjController implements BzkBzTabZhuanyejsdjApi{

    private final BzkBzTabZhuanyejsdjService bzkBzTabZhuanyejsdjService;

    @Override
    public BzkBzTabZhuanyejsdjService getService(){
        return bzkBzTabZhuanyejsdjService;
     }
}