package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabJunxianService;
import com.cardinal.tech.bzfx.api.BzkBzTabJunxianApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 军衔(BzkBzTabJunxian)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:56
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabJunxianController implements BzkBzTabJunxianApi{

    private final BzkBzTabJunxianService bzkBzTabJunxianService;

    @Override
    public BzkBzTabJunxianService getService(){
        return bzkBzTabJunxianService;
     }
}