package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabJicengyljglsService;
import com.cardinal.tech.bzfx.api.BzkBzTabJicengyljglsApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 体系医院历史表(BzkBzTabJicengyljgls)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:56
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabJicengyljglsController implements BzkBzTabJicengyljglsApi{

    private final BzkBzTabJicengyljglsService bzkBzTabJicengyljglsService;

    @Override
    public BzkBzTabJicengyljglsService getService(){
        return bzkBzTabJicengyljglsService;
     }
}