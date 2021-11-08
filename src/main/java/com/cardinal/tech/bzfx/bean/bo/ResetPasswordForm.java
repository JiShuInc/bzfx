package com.cardinal.tech.bzfx.bean.bo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
public class ResetPasswordForm {
    @Schema(description = "old password")
    @NotBlank(message = "原密码不能为空")
    private String old_password;
    @Schema(description = "new password")
    @NotBlank(message = "新密码不能为空")
    @Length(min = 6, message = "密码必须大于6个字符")
    private String new_password;
}
