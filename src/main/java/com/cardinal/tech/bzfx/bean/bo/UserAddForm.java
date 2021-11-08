package com.cardinal.tech.bzfx.bean.bo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class UserAddForm {
    @Schema(description = "username for sign in", required = true)
    @NotBlank(message = "用户名不能为空")
    private String username;
    private String password="Guest2021@bzms";
}
