package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabJunzhongService;
import com.cardinal.tech.bzfx.api.BzkBzTabJunzhongApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 军种(BzkBzTabJunzhong)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:56
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabJunzhongController implements BzkBzTabJunzhongApi{

    private final BzkBzTabJunzhongService bzkBzTabJunzhongService;

    @Override
    public BzkBzTabJunzhongService getService(){
        return bzkBzTabJunzhongService;
     }
}