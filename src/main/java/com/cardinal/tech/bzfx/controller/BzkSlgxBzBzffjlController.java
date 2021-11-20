package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkSlgxBzBzffjlService;
import com.cardinal.tech.bzfx.api.BzkSlgxBzBzffjlApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 被装发放记录(BzkSlgxBzBzffjl)表控制层
 *
 * @author makejava
 * @since 2021-11-20 16:06:13
 */
@RequiredArgsConstructor
@RestController
public class BzkSlgxBzBzffjlController implements BzkSlgxBzBzffjlApi{

    private final BzkSlgxBzBzffjlService bzkSlgxBzBzffjlService;

    @Override
    public BzkSlgxBzBzffjlService getService(){
        return bzkSlgxBzBzffjlService;
     }
}