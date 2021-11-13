package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.TjTixiyyService;
import com.cardinal.tech.bzfx.api.TjTixiyyApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 体系医院标准编码(TjTixiyy)表控制层
 *
 * @author cadinal.tech
 * @since 2021-11-13 20:00:38
 */
@RequiredArgsConstructor
@RestController
public class TjTixiyyController implements TjTixiyyApi{

    private final TjTixiyyService tjTixiyyService;

    @Override
    public TjTixiyyService getService(){
        return tjTixiyyService;
     }
}