package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.TaskBzkSlgxYfRyzfqkService;
import com.cardinal.tech.bzfx.api.TaskBzkSlgxYfRyzfqkApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 人员住房情况(TaskBzkSlgxYfRyzfqk)表控制层
 *
 * @author makejava
 * @since 2021-11-28 12:40:57
 */
@RequiredArgsConstructor
@RestController
public class TaskBzkSlgxYfRyzfqkController implements TaskBzkSlgxYfRyzfqkApi{

    private final TaskBzkSlgxYfRyzfqkService taskBzkSlgxYfRyzfqkService;

    @Override
    public TaskBzkSlgxYfRyzfqkService getService(){
        return taskBzkSlgxYfRyzfqkService;
     }
}