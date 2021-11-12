package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.SlNetDiskService;
import com.cardinal.tech.bzfx.api.SlNetDiskApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 文档资料(SlNetDisk)表控制层
 *
 * @author cadinal.tech
 * @since 2021-11-13 01:33:38
 */
@RequiredArgsConstructor
@RestController
public class SlNetDiskController implements SlNetDiskApi{

    private final SlNetDiskService slNetDiskService;

    @Override
    public SlNetDiskService getService(){
        return slNetDiskService;
     }
}