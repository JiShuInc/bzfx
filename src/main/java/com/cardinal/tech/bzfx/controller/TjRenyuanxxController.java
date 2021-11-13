package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.TjRenyuanxxService;
import com.cardinal.tech.bzfx.api.TjRenyuanxxApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 人员表(TjRenyuanxx)表控制层
 *
 * @author cadinal.tech
 * @since 2021-11-13 19:28:47
 */
@RequiredArgsConstructor
@RestController
public class TjRenyuanxxController implements TjRenyuanxxApi{

    private final TjRenyuanxxService tjRenyuanxxService;

    @Override
    public TjRenyuanxxService getService(){
        return tjRenyuanxxService;
     }
}