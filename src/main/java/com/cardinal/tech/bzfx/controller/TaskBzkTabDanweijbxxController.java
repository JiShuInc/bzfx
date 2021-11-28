package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.TaskBzkTabDanweijbxxService;
import com.cardinal.tech.bzfx.api.TaskBzkTabDanweijbxxApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 单位基本信息(TaskBzkTabDanweijbxx)表控制层
 *
 * @author makejava
 * @since 2021-11-28 12:40:57
 */
@RequiredArgsConstructor
@RestController
public class TaskBzkTabDanweijbxxController implements TaskBzkTabDanweijbxxApi{

    private final TaskBzkTabDanweijbxxService taskBzkTabDanweijbxxService;

    @Override
    public TaskBzkTabDanweijbxxService getService(){
        return taskBzkTabDanweijbxxService;
     }
}