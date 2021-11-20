package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.config.controller.BaseController;
import com.cardinal.tech.bzfx.service.BzkTabBaozhangkjbxxService;
import com.cardinal.tech.bzfx.api.BzkTabBaozhangkjbxxApi;
import com.cardinal.tech.bzfx.service.JkApiUserService;
import com.cardinal.tech.bzfx.service.UserService;
import org.springframework.web.bind.annotation.*;

/**
 * 保障卡基本信息(BzkTabBaozhangkjbxx)表控制层
 *
 * @author makejava
 * @since 2021-11-20 16:06:13
 */
@RestController
public class BzkTabBaozhangkjbxxController extends BaseController implements BzkTabBaozhangkjbxxApi {

    private final BzkTabBaozhangkjbxxService bzkTabBaozhangkjbxxService;

    public BzkTabBaozhangkjbxxController(UserService userService, JkApiUserService apiUserService, BzkTabBaozhangkjbxxService bzkTabBaozhangkjbxxService) {
        super(userService, apiUserService);
        this.bzkTabBaozhangkjbxxService = bzkTabBaozhangkjbxxService;
    }

    @Override
    public BzkTabBaozhangkjbxxService getService() {
        return bzkTabBaozhangkjbxxService;
    }
}