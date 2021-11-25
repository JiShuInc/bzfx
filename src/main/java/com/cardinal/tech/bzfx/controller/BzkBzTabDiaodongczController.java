package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabDiaodongczService;
import com.cardinal.tech.bzfx.api.BzkBzTabDiaodongczApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 调动操作(BzkBzTabDiaodongcz)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:54
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabDiaodongczController implements BzkBzTabDiaodongczApi{

    private final BzkBzTabDiaodongczService bzkBzTabDiaodongczService;

    @Override
    public BzkBzTabDiaodongczService getService(){
        return bzkBzTabDiaodongczService;
     }
}