package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabGangweidjService;
import com.cardinal.tech.bzfx.api.BzkBzTabGangweidjApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 岗位等级标准编码(BzkBzTabGangweidj)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:55
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabGangweidjController implements BzkBzTabGangweidjApi{

    private final BzkBzTabGangweidjService bzkBzTabGangweidjService;

    @Override
    public BzkBzTabGangweidjService getService(){
        return bzkBzTabGangweidjService;
     }
}