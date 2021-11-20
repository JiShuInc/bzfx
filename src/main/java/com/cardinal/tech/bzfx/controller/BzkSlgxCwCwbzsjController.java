package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.config.controller.BaseController;
import com.cardinal.tech.bzfx.service.BzkSlgxCwCwbzsjService;
import com.cardinal.tech.bzfx.api.BzkSlgxCwCwbzsjApi;
import com.cardinal.tech.bzfx.service.JkApiUserService;
import com.cardinal.tech.bzfx.service.UserService;
import org.springframework.web.bind.annotation.*;

/**
 * 财务保障数据(BzkSlgxCwCwbzsj)表控制层
 *
 * @author makejava
 * @since 2021-11-20 16:06:13
 */
@RestController
public class BzkSlgxCwCwbzsjController extends BaseController implements BzkSlgxCwCwbzsjApi {

    private final BzkSlgxCwCwbzsjService bzkSlgxCwCwbzsjService;

    public BzkSlgxCwCwbzsjController(UserService userService, JkApiUserService apiuserService, BzkSlgxCwCwbzsjService bzkSlgxCwCwbzsjService) {
        super(userService, apiuserService);
        this.bzkSlgxCwCwbzsjService = bzkSlgxCwCwbzsjService;
    }

    @Override
    public BzkSlgxCwCwbzsjService getService() {
        return bzkSlgxCwCwbzsjService;
    }
}