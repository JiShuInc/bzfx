package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabCanjiaylbxService;
import com.cardinal.tech.bzfx.api.BzkBzTabCanjiaylbxApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 参加医疗保险情况标准编码表(BzkBzTabCanjiaylbx)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:54
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabCanjiaylbxController implements BzkBzTabCanjiaylbxApi{

    private final BzkBzTabCanjiaylbxService bzkBzTabCanjiaylbxService;

    @Override
    public BzkBzTabCanjiaylbxService getService(){
        return bzkBzTabCanjiaylbxService;
     }
}