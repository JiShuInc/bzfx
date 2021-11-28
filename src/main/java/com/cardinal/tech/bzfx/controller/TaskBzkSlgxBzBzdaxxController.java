package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.TaskBzkSlgxBzBzdaxxService;
import com.cardinal.tech.bzfx.api.TaskBzkSlgxBzBzdaxxApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 被装档案信息(TaskBzkSlgxBzBzdaxx)表控制层
 *
 * @author makejava
 * @since 2021-11-28 12:40:57
 */
@RequiredArgsConstructor
@RestController
public class TaskBzkSlgxBzBzdaxxController implements TaskBzkSlgxBzBzdaxxApi{

    private final TaskBzkSlgxBzBzdaxxService taskBzkSlgxBzBzdaxxService;

    @Override
    public TaskBzkSlgxBzBzdaxxService getService(){
        return taskBzkSlgxBzBzdaxxService;
     }
}