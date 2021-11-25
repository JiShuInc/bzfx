package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabJicengyljgdyService;
import com.cardinal.tech.bzfx.api.BzkBzTabJicengyljgdyApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 体系医院对应表(BzkBzTabJicengyljgdy)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:56
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabJicengyljgdyController implements BzkBzTabJicengyljgdyApi{

    private final BzkBzTabJicengyljgdyService bzkBzTabJicengyljgdyService;

    @Override
    public BzkBzTabJicengyljgdyService getService(){
        return bzkBzTabJicengyljgdyService;
     }
}