package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabRylbjxdyService;
import com.cardinal.tech.bzfx.api.BzkBzTabRylbjxdyApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 人员类别军衔对应表(BzkBzTabRylbjxdy)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabRylbjxdyController implements BzkBzTabRylbjxdyApi{

    private final BzkBzTabRylbjxdyService bzkBzTabRylbjxdyService;

    @Override
    public BzkBzTabRylbjxdyService getService(){
        return bzkBzTabRylbjxdyService;
     }
}