package com.cardinal.tech.bzfx.bean.bo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class SignInForm {
    @Schema(description = "username for sign in", required = true)
    @NotBlank(message = "用户名不能为空")
    private String username;
    @Schema(description = "password for sign in", required = true)
    @NotBlank(message = "密码不能为空")
    private String password;
}
