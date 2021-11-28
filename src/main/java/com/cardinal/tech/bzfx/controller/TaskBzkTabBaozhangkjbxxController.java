package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.TaskBzkTabBaozhangkjbxxService;
import com.cardinal.tech.bzfx.api.TaskBzkTabBaozhangkjbxxApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 保障卡基本信息(TaskBzkTabBaozhangkjbxx)表控制层
 *
 * @author makejava
 * @since 2021-11-28 12:40:57
 */
@RequiredArgsConstructor
@RestController
public class TaskBzkTabBaozhangkjbxxController implements TaskBzkTabBaozhangkjbxxApi{

    private final TaskBzkTabBaozhangkjbxxService taskBzkTabBaozhangkjbxxService;

    @Override
    public TaskBzkTabBaozhangkjbxxService getService(){
        return taskBzkTabBaozhangkjbxxService;
     }
}