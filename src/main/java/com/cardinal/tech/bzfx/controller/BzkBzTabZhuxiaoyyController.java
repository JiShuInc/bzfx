package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabZhuxiaoyyService;
import com.cardinal.tech.bzfx.api.BzkBzTabZhuxiaoyyApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 注销原因(BzkBzTabZhuxiaoyy)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:59
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabZhuxiaoyyController implements BzkBzTabZhuxiaoyyApi{

    private final BzkBzTabZhuxiaoyyService bzkBzTabZhuxiaoyyService;

    @Override
    public BzkBzTabZhuxiaoyyService getService(){
        return bzkBzTabZhuxiaoyyService;
     }
}