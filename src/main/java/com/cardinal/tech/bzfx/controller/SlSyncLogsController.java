package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.SlSyncLogsService;
import com.cardinal.tech.bzfx.api.SlSyncLogsApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 数据同步日志(SlSyncLogs)表控制层
 *
 * @author cadinal.tech
 * @since 2021-11-13 20:00:37
 */
@RequiredArgsConstructor
@RestController
public class SlSyncLogsController implements SlSyncLogsApi{

    private final SlSyncLogsService slSyncLogsService;

    @Override
    public SlSyncLogsService getService(){
        return slSyncLogsService;
     }
}