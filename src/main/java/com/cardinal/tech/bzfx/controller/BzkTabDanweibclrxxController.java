package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.config.controller.BaseController;
import com.cardinal.tech.bzfx.service.BzkTabDanweibclrxxService;
import com.cardinal.tech.bzfx.api.BzkTabDanweibclrxxApi;
import com.cardinal.tech.bzfx.service.JkApiUserService;
import com.cardinal.tech.bzfx.service.UserService;
import org.springframework.web.bind.annotation.*;

/**
 * 单位补充录入信息(BzkTabDanweibclrxx)表控制层
 *
 * @author makejava
 * @since 2021-11-20 16:06:13
 */
@RestController
public class BzkTabDanweibclrxxController extends BaseController implements BzkTabDanweibclrxxApi {

    private final BzkTabDanweibclrxxService bzkTabDanweibclrxxService;

    public BzkTabDanweibclrxxController(UserService userService, JkApiUserService apiUserService, BzkTabDanweibclrxxService bzkTabDanweibclrxxService) {
        super(userService, apiUserService);
        this.bzkTabDanweibclrxxService = bzkTabDanweibclrxxService;
    }

    @Override
    public BzkTabDanweibclrxxService getService() {
        return bzkTabDanweibclrxxService;
    }
}