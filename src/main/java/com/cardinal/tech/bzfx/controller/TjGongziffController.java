package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.TjGongziffService;
import com.cardinal.tech.bzfx.api.TjGongziffApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 工资发放表(TjGongziff)表控制层
 *
 * @author cadinal.tech
 * @since 2021-11-13 20:00:38
 */
@RequiredArgsConstructor
@RestController
public class TjGongziffController implements TjGongziffApi{

    private final TjGongziffService tjGongziffService;

    @Override
    public TjGongziffService getService(){
        return tjGongziffService;
     }
}