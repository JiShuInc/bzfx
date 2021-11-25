package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabRylbcwjxdyService;
import com.cardinal.tech.bzfx.api.BzkBzTabRylbcwjxdyApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 人员类别军衔对应表(BzkBzTabRylbcwjxdy)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:57
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabRylbcwjxdyController implements BzkBzTabRylbcwjxdyApi{

    private final BzkBzTabRylbcwjxdyService bzkBzTabRylbcwjxdyService;

    @Override
    public BzkBzTabRylbcwjxdyService getService(){
        return bzkBzTabRylbcwjxdyService;
     }
}