package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabJiashusflService;
import com.cardinal.tech.bzfx.api.BzkBzTabJiashusflApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 家属身份类别(BzkBzTabJiashusfl)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:56
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabJiashusflController implements BzkBzTabJiashusflApi{

    private final BzkBzTabJiashusflService bzkBzTabJiashusflService;

    @Override
    public BzkBzTabJiashusflService getService(){
        return bzkBzTabJiashusflService;
     }
}