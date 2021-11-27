package com.cardinal.tech.bzfx.bean.bo;

import com.cardinal.tech.bzfx.entity.BzkTabRenyuanjbxx;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Accessors(chain = true)
@Data
public class JcSpecialRyBO {
    private Long sid;
    private List<BzkTabRenyuanjbxx> ryxx;
}
