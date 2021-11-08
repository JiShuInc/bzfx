package com.cardinal.tech.bzfx.bean.bo;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class ResetUserPasswordForm {
    @NotNull(message = "用户id不能为空")
    private Integer id;
    @NotBlank(message = "新密码不能为空")
    @Length(min = 6, message = "密码必须大于等于6个字符")
    private String new_password;
}
