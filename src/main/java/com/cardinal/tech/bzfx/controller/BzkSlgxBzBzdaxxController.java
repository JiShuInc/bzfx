package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkSlgxBzBzdaxxService;
import com.cardinal.tech.bzfx.api.BzkSlgxBzBzdaxxApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 被装档案信息(BzkSlgxBzBzdaxx)表控制层
 *
 * @author makejava
 * @since 2021-11-20 16:06:13
 */
@RequiredArgsConstructor
@RestController
public class BzkSlgxBzBzdaxxController implements BzkSlgxBzBzdaxxApi{

    private final BzkSlgxBzBzdaxxService bzkSlgxBzBzdaxxService;

    @Override
    public BzkSlgxBzBzdaxxService getService(){
        return bzkSlgxBzBzdaxxService;
     }
}