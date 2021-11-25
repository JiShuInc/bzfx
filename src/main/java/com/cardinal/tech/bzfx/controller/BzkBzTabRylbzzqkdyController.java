package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabRylbzzqkdyService;
import com.cardinal.tech.bzfx.api.BzkBzTabRylbzzqkdyApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 人员类别在职情况对应表(BzkBzTabRylbzzqkdy)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabRylbzzqkdyController implements BzkBzTabRylbzzqkdyApi{

    private final BzkBzTabRylbzzqkdyService bzkBzTabRylbzzqkdyService;

    @Override
    public BzkBzTabRylbzzqkdyService getService(){
        return bzkBzTabRylbzzqkdyService;
     }
}