package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.TaskBzkSlgxCwCwbzsjService;
import com.cardinal.tech.bzfx.api.TaskBzkSlgxCwCwbzsjApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 财务保障数据(TaskBzkSlgxCwCwbzsj)表控制层
 *
 * @author makejava
 * @since 2021-11-28 12:40:57
 */
@RequiredArgsConstructor
@RestController
public class TaskBzkSlgxCwCwbzsjController implements TaskBzkSlgxCwCwbzsjApi{

    private final TaskBzkSlgxCwCwbzsjService taskBzkSlgxCwCwbzsjService;

    @Override
    public TaskBzkSlgxCwCwbzsjService getService(){
        return taskBzkSlgxCwCwbzsjService;
     }
}