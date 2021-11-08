package com.cardinal.tech.bzfx.bean.bo;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * page object
 *
 * @param <T>
 * @author zbw
 */
@Data
public class Page<T> {

    @Schema(description = "total record number")
    private Integer total = 0;
    @Schema(description = "records per page")
    private Integer pageSize = 10;
    @Schema(description = "current page")
    private Integer currentPage;
    @Schema(description = "data list")
    private List<T> data = new ArrayList<T>();
    @Schema(description = "total page")
    private Integer totalPage;

    public Page() {
    }

    public Page(Integer total, Integer pageSize, Integer currentPage) {
        this.total = total;
        this.pageSize = pageSize;
        this.currentPage = currentPage;
    }

    public Integer getTotalPage() {
        return (this.total + this.pageSize - 1) / this.pageSize;
    }

}
