package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.TaskBzkTabDanweibclrxxService;
import com.cardinal.tech.bzfx.api.TaskBzkTabDanweibclrxxApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 单位补充录入信息(TaskBzkTabDanweibclrxx)表控制层
 *
 * @author makejava
 * @since 2021-11-28 12:40:57
 */
@RequiredArgsConstructor
@RestController
public class TaskBzkTabDanweibclrxxController implements TaskBzkTabDanweibclrxxApi{

    private final TaskBzkTabDanweibclrxxService taskBzkTabDanweibclrxxService;

    @Override
    public TaskBzkTabDanweibclrxxService getService(){
        return taskBzkTabDanweibclrxxService;
     }
}