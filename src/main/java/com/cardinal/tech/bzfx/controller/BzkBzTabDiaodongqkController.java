package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabDiaodongqkService;
import com.cardinal.tech.bzfx.api.BzkBzTabDiaodongqkApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 调动情况(BzkBzTabDiaodongqk)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:54
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabDiaodongqkController implements BzkBzTabDiaodongqkApi{

    private final BzkBzTabDiaodongqkService bzkBzTabDiaodongqkService;

    @Override
    public BzkBzTabDiaodongqkService getService(){
        return bzkBzTabDiaodongqkService;
     }
}