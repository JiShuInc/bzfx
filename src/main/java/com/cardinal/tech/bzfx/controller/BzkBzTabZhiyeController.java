package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabZhiyeService;
import com.cardinal.tech.bzfx.api.BzkBzTabZhiyeApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 职业(BzkBzTabZhiye)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabZhiyeController implements BzkBzTabZhiyeApi{

    private final BzkBzTabZhiyeService bzkBzTabZhiyeService;

    @Override
    public BzkBzTabZhiyeService getService(){
        return bzkBzTabZhiyeService;
     }
}