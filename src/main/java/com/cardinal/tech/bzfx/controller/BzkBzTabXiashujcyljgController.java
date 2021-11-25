package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabXiashujcyljgService;
import com.cardinal.tech.bzfx.api.BzkBzTabXiashujcyljgApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 基层医疗机构表(BzkBzTabXiashujcyljg)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabXiashujcyljgController implements BzkBzTabXiashujcyljgApi{

    private final BzkBzTabXiashujcyljgService bzkBzTabXiashujcyljgService;

    @Override
    public BzkBzTabXiashujcyljgService getService(){
        return bzkBzTabXiashujcyljgService;
     }
}