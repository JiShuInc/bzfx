package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabJiaoyangzService;
import com.cardinal.tech.bzfx.api.BzkBzTabJiaoyangzApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 质量分析校验规则字典表(BzkBzTabJiaoyangz)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:56
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabJiaoyangzController implements BzkBzTabJiaoyangzApi{

    private final BzkBzTabJiaoyangzService bzkBzTabJiaoyangzService;

    @Override
    public BzkBzTabJiaoyangzService getService(){
        return bzkBzTabJiaoyangzService;
     }
}