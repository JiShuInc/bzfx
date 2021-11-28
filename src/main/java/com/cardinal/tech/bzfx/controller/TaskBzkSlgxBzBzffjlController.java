package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.TaskBzkSlgxBzBzffjlService;
import com.cardinal.tech.bzfx.api.TaskBzkSlgxBzBzffjlApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 被装发放记录(TaskBzkSlgxBzBzffjl)表控制层
 *
 * @author makejava
 * @since 2021-11-28 12:40:57
 */
@RequiredArgsConstructor
@RestController
public class TaskBzkSlgxBzBzffjlController implements TaskBzkSlgxBzBzffjlApi{

    private final TaskBzkSlgxBzBzffjlService taskBzkSlgxBzBzffjlService;

    @Override
    public TaskBzkSlgxBzBzffjlService getService(){
        return taskBzkSlgxBzBzffjlService;
     }
}