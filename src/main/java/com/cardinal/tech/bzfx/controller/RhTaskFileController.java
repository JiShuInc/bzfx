package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.RhTaskFileService;
import com.cardinal.tech.bzfx.api.RhTaskFileApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 任务数据-文件(RhTaskFile)表控制层
 *
 * @author cadinal.tech
 * @since 2021-11-13 19:28:47
 */
@RequiredArgsConstructor
@RestController
public class RhTaskFileController implements RhTaskFileApi{

    private final RhTaskFileService rhTaskFileService;

    @Override
    public RhTaskFileService getService(){
        return rhTaskFileService;
     }
}