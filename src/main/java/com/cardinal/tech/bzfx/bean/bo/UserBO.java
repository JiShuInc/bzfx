package com.cardinal.tech.bzfx.bean.bo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Accessors(chain = true)
public class UserBO {
    private Integer id;
    private String username;
    private Date creat_time;
    private Date edit_time;
}
