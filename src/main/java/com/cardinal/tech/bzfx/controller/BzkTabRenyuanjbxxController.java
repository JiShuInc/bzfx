package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.config.controller.BaseController;
import com.cardinal.tech.bzfx.service.BzkTabRenyuanjbxxService;
import com.cardinal.tech.bzfx.api.BzkTabRenyuanjbxxApi;
import com.cardinal.tech.bzfx.service.JkApiUserService;
import com.cardinal.tech.bzfx.service.UserService;
import org.springframework.web.bind.annotation.*;

/**
 * 人员基本信息(BzkTabRenyuanjbxx)表控制层
 *
 * @author makejava
 * @since 2021-11-20 16:06:13
 */
@RestController
public class BzkTabRenyuanjbxxController extends BaseController implements BzkTabRenyuanjbxxApi {

    private final BzkTabRenyuanjbxxService bzkTabRenyuanjbxxService;

    public BzkTabRenyuanjbxxController(UserService userService, JkApiUserService apiUserService, BzkTabRenyuanjbxxService bzkTabRenyuanjbxxService) {
        super(userService, apiUserService);
        this.bzkTabRenyuanjbxxService = bzkTabRenyuanjbxxService;
    }

    @Override
    public BzkTabRenyuanjbxxService getService() {
        return bzkTabRenyuanjbxxService;
    }
}