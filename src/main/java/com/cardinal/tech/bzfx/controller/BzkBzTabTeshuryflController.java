package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabTeshuryflService;
import com.cardinal.tech.bzfx.api.BzkBzTabTeshuryflApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 特殊人员分类(BzkBzTabTeshuryfl)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabTeshuryflController implements BzkBzTabTeshuryflApi{

    private final BzkBzTabTeshuryflService bzkBzTabTeshuryflService;

    @Override
    public BzkBzTabTeshuryflService getService(){
        return bzkBzTabTeshuryflService;
     }
}