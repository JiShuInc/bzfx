package com.cardinal.tech.bzfx.bean.dbo.page;

import lombok.Data;

import java.util.List;

/**
 * 分页查询对象
 *
 * @author zbw
 */
@Data
public class PageResult<T> {
    private int max;
    private int totalCount;
    private int currentPage;
    private List<T> pageData;


}
