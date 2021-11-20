package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.config.controller.BaseController;
import com.cardinal.tech.bzfx.service.BzkSlgxBzBzffjlService;
import com.cardinal.tech.bzfx.api.BzkSlgxBzBzffjlApi;
import com.cardinal.tech.bzfx.service.JkApiUserService;
import com.cardinal.tech.bzfx.service.UserService;
import org.springframework.web.bind.annotation.*;

/**
 * 被装发放记录(BzkSlgxBzBzffjl)表控制层
 *
 * @author makejava
 * @since 2021-11-20 16:06:13
 */
@RestController
public class BzkSlgxBzBzffjlController extends BaseController implements BzkSlgxBzBzffjlApi {

    private final BzkSlgxBzBzffjlService bzkSlgxBzBzffjlService;

    public BzkSlgxBzBzffjlController(UserService userService, JkApiUserService apiuserService, BzkSlgxBzBzffjlService bzkSlgxBzBzffjlService) {
        super(userService, apiuserService);
        this.bzkSlgxBzBzffjlService = bzkSlgxBzBzffjlService;
    }

    @Override
    public BzkSlgxBzBzffjlService getService() {
        return bzkSlgxBzBzffjlService;
    }
}