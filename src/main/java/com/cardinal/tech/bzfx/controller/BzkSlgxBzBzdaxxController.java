package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.config.controller.BaseController;
import com.cardinal.tech.bzfx.service.BzkSlgxBzBzdaxxService;
import com.cardinal.tech.bzfx.api.BzkSlgxBzBzdaxxApi;
import com.cardinal.tech.bzfx.service.JkApiUserService;
import com.cardinal.tech.bzfx.service.UserService;
import org.springframework.web.bind.annotation.*;

/**
 * 被装档案信息(BzkSlgxBzBzdaxx)表控制层
 *
 * @author makejava
 * @since 2021-11-20 16:06:13
 */
@RestController
public class BzkSlgxBzBzdaxxController extends BaseController implements BzkSlgxBzBzdaxxApi {

    private final BzkSlgxBzBzdaxxService bzkSlgxBzBzdaxxService;

    public BzkSlgxBzBzdaxxController(UserService userService, JkApiUserService apiUserService, BzkSlgxBzBzdaxxService bzkSlgxBzBzdaxxService) {
        super(userService, apiUserService);
        this.bzkSlgxBzBzdaxxService = bzkSlgxBzBzdaxxService;
    }

    @Override
    public BzkSlgxBzBzdaxxService getService() {
        return bzkSlgxBzBzdaxxService;
    }

}