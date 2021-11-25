package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabShenhejgService;
import com.cardinal.tech.bzfx.api.BzkBzTabShenhejgApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 审核结果(BzkBzTabShenhejg)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabShenhejgController implements BzkBzTabShenhejgApi{

    private final BzkBzTabShenhejgService bzkBzTabShenhejgService;

    @Override
    public BzkBzTabShenhejgService getService(){
        return bzkBzTabShenhejgService;
     }
}