package com.cardinal.tech.bzfx.controller;

import com.cardinal.tech.bzfx.config.controller.BaseController;
import com.cardinal.tech.bzfx.api.BzkBzTabJicengyljgApi;
import com.cardinal.tech.bzfx.service.BzkBzTabJicengyljgService;
import com.cardinal.tech.bzfx.service.JkApiUserService;
import com.cardinal.tech.bzfx.service.UserService;
import org.springframework.web.bind.annotation.RestController;

/**
 * 体系医院标准编码(BzkBzTabJicengyljg)表控制层
 *
 * @author makejava
 * @since 2021-11-20 23:59:46
 */
@RestController
public class BzkBzTabJicengyljgController extends BaseController implements BzkBzTabJicengyljgApi{

    private final BzkBzTabJicengyljgService bzkBzTabJicengyljgService;

    public BzkBzTabJicengyljgController(UserService userService, JkApiUserService apiuserService, BzkBzTabJicengyljgService bzkBzTabJicengyljgService) {
        super(userService, apiuserService);
        this.bzkBzTabJicengyljgService = bzkBzTabJicengyljgService;
    }

    @Override
    public BzkBzTabJicengyljgService getService(){
        return bzkBzTabJicengyljgService;
     }
}