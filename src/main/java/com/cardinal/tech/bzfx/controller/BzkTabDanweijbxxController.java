package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.api.BzkTabDanweijbxxApi;
import com.cardinal.tech.bzfx.config.controller.BaseController;
import com.cardinal.tech.bzfx.service.BzkTabDanweijbxxService;
import com.cardinal.tech.bzfx.service.JkApiUserService;
import com.cardinal.tech.bzfx.service.UserService;
import org.springframework.web.bind.annotation.RestController;

/**
 * 单位基本信息(BzkTabDanweijbxx)表控制层
 *
 * @author makejava
 * @since 2021-11-20 16:06:13
 */
@RestController
public class BzkTabDanweijbxxController extends BaseController implements BzkTabDanweijbxxApi {

    private final BzkTabDanweijbxxService bzkTabDanweijbxxService;

    public BzkTabDanweijbxxController(UserService userService, JkApiUserService apiUserService, BzkTabDanweijbxxService bzkTabDanweijbxxService) {
        super(userService, apiUserService);
        this.bzkTabDanweijbxxService = bzkTabDanweijbxxService;
    }

    @Override
    public BzkTabDanweijbxxService getService() {
        return bzkTabDanweijbxxService;
    }
}