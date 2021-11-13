package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.GgLogsService;
import com.cardinal.tech.bzfx.api.GgLogsApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 日志(GgLogs)表控制层
 *
 * @author cadinal.tech
 * @since 2021-11-13 20:00:37
 */
@RequiredArgsConstructor
@RestController
public class GgLogsController implements GgLogsApi{

    private final GgLogsService ggLogsService;

    @Override
    public GgLogsService getService(){
        return ggLogsService;
     }
}