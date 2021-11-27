package com.cardinal.tech.bzfx.util;

import com.cardinal.tech.bzfx.dao.GgLogsDao;
import com.cardinal.tech.bzfx.entity.GgLogs;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * hua
 *
 * @description
 * @menu
 */
@Component
@RequiredArgsConstructor
public class GgLogsUtil {

    public final GgLogsDao ggLogsDao;

    @Async
    public void syncRecord(String message){

        GgLogs ggLogs = new GgLogs();
        ggLogs.setCreatAt(new Date());
        ggLogs.setModule(1);
        ggLogs.setType(0);
        ggLogs.setContent(message);
        ggLogsDao.insert(ggLogs);
    };
}
