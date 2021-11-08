package com.cardinal.tech.bzfx.bean.bo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * page request form
 *
 * @param <T>
 */

@Data
public class PageForm<T> {
    @Schema(description = "page num default value 1")
    private Integer currentPage=1;
    @Schema(description = "page size default value 10")
    private Integer pageSize=10;
    @Schema(description = "T for search is a condition")
    private T t;

}
