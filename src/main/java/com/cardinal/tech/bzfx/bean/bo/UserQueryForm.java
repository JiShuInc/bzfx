package com.cardinal.tech.bzfx.bean.bo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class UserQueryForm {
    @Schema(description = "username")
    private String username;
    @Schema(description = "user id")
    private Integer id;
}
