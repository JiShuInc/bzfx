package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.service.BzkBzTabXuexingService;
import com.cardinal.tech.bzfx.api.BzkBzTabXuexingApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 血型(BzkBzTabXuexing)表控制层
 *
 * @author makejava
 * @since 2021-11-25 15:22:58
 */
@RequiredArgsConstructor
@RestController
public class BzkBzTabXuexingController implements BzkBzTabXuexingApi{

    private final BzkBzTabXuexingService bzkBzTabXuexingService;

    @Override
    public BzkBzTabXuexingService getService(){
        return bzkBzTabXuexingService;
     }
}