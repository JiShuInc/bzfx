package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabJicengyljgService;
import com.cardinal.tech.bzfx.api.BzkBzTabJicengyljgApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 体系医院标准编码(BzkBzTabJicengyljg)表控制层
 *
 * @author makejava
 * @since 2021-11-20 23:59:46
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabJicengyljgController implements BzkBzTabJicengyljgApi{

    private final BzkBzTabJicengyljgService bzkBzTabJicengyljgService;

    @Override
    public BzkBzTabJicengyljgService getService(){
        return bzkBzTabJicengyljgService;
     }
}