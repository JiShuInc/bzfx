package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.TaskBzkTabRenyuanjbxxService;
import com.cardinal.tech.bzfx.api.TaskBzkTabRenyuanjbxxApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 人员基本信息(TaskBzkTabRenyuanjbxx)表控制层
 *
 * @author makejava
 * @since 2021-11-28 12:40:57
 */
@RequiredArgsConstructor
@RestController
public class TaskBzkTabRenyuanjbxxController implements TaskBzkTabRenyuanjbxxApi{

    private final TaskBzkTabRenyuanjbxxService taskBzkTabRenyuanjbxxService;

    @Override
    public TaskBzkTabRenyuanjbxxService getService(){
        return taskBzkTabRenyuanjbxxService;
     }
}