package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabGangweizwcjService;
import com.cardinal.tech.bzfx.api.BzkBzTabGangweizwcjApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 岗位职务层级标准编码(BzkBzTabGangweizwcj)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:55
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabGangweizwcjController implements BzkBzTabGangweizwcjApi{

    private final BzkBzTabGangweizwcjService bzkBzTabGangweizwcjService;

    @Override
    public BzkBzTabGangweizwcjService getService(){
        return bzkBzTabGangweizwcjService;
     }
}