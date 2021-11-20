package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkSlgxYfRyzfqkService;
import com.cardinal.tech.bzfx.api.BzkSlgxYfRyzfqkApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 人员住房情况(BzkSlgxYfRyzfqk)表控制层
 *
 * @author makejava
 * @since 2021-11-20 16:06:13
 */
@RequiredArgsConstructor
@RestController
public class BzkSlgxYfRyzfqkController implements BzkSlgxYfRyzfqkApi{

    private final BzkSlgxYfRyzfqkService bzkSlgxYfRyzfqkService;

    @Override
    public BzkSlgxYfRyzfqkService getService(){
        return bzkSlgxYfRyzfqkService;
     }
}