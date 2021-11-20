package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.api.BzkSlgxYfRyzfqkApi;
import com.cardinal.tech.bzfx.config.controller.BaseController;
import com.cardinal.tech.bzfx.service.BzkSlgxYfRyzfqkService;
import com.cardinal.tech.bzfx.service.JkApiUserService;
import com.cardinal.tech.bzfx.service.UserService;
import org.springframework.web.bind.annotation.RestController;

/**
 * 人员住房情况(BzkSlgxYfRyzfqk)表控制层
 *
 * @author makejava
 * @since 2021-11-20 16:06:13
 */
@RestController
public class BzkSlgxYfRyzfqkController extends BaseController implements BzkSlgxYfRyzfqkApi {

    private final BzkSlgxYfRyzfqkService bzkSlgxYfRyzfqkService;

    public BzkSlgxYfRyzfqkController(UserService userService, JkApiUserService apiuserService, BzkSlgxYfRyzfqkService bzkSlgxYfRyzfqkService) {
        super(userService, apiuserService);
        this.bzkSlgxYfRyzfqkService = bzkSlgxYfRyzfqkService;
    }

    @Override
    public BzkSlgxYfRyzfqkService getService() {
        return bzkSlgxYfRyzfqkService;
    }
}