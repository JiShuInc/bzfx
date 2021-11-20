package com.cardinal.tech.bzfx.bean.bo;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class RoleAddForm {
    @NotNull(message="用户id不能为空")
    private Integer userId;
    @NotNull(message="角色不能为空")
    private Integer roleId;
}
