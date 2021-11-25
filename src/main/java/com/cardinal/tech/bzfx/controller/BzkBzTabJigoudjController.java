package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabJigoudjService;
import com.cardinal.tech.bzfx.api.BzkBzTabJigoudjApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 机构等级(BzkBzTabJigoudj)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:56
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabJigoudjController implements BzkBzTabJigoudjApi{

    private final BzkBzTabJigoudjService bzkBzTabJigoudjService;

    @Override
    public BzkBzTabJigoudjService getService(){
        return bzkBzTabJigoudjService;
     }
}