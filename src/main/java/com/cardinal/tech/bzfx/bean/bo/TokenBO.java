package com.cardinal.tech.bzfx.bean.bo;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class TokenBO {
    private String token;
    private Date expireTime;
    private Integer role;
}
