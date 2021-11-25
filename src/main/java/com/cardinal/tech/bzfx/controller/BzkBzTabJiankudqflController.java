package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabJiankudqflService;
import com.cardinal.tech.bzfx.api.BzkBzTabJiankudqflApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 艰苦地区分类(BzkBzTabJiankudqfl)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:56
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabJiankudqflController implements BzkBzTabJiankudqflApi{

    private final BzkBzTabJiankudqflService bzkBzTabJiankudqflService;

    @Override
    public BzkBzTabJiankudqflService getService(){
        return bzkBzTabJiankudqflService;
     }
}