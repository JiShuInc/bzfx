package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabZhengmingclService;
import com.cardinal.tech.bzfx.api.BzkBzTabZhengmingclApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 证明材料(BzkBzTabZhengmingcl)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabZhengmingclController implements BzkBzTabZhengmingclApi{

    private final BzkBzTabZhengmingclService bzkBzTabZhengmingclService;

    @Override
    public BzkBzTabZhengmingclService getService(){
        return bzkBzTabZhengmingclService;
     }
}