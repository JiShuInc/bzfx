package com.cardinal.tech.bzfx.bean.dbo.page;

import com.cardinal.tech.bzfx.bean.bo.PageForm;
import com.cardinal.tech.bzfx.util.ReflectUtil;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class PageQuery<T> {
    private static final Integer DEFAULT_CURRENT_PAGE = 1;
    private static final Integer DEFAULT_PAGE_SIZE = 10;
    private Integer max;
    private Integer currentPage;
    private Integer totalCount;
    private Map<String, Object> obj = new HashMap<String, Object>();

    public PageQuery() {
    }

    public PageQuery(PageForm<T> form) {
        this.max = form.getPageSize();
        this.currentPage = form.getCurrentPage();
        var t = form.getT();
        if (t != null) {
            this.obj = ReflectUtil.getAllFieldMap(t, t.getClass());
        }
    }

    public PageQuery(Integer currentPage, Integer max) {
        this.max = max;
        this.currentPage = currentPage;
    }

    public Integer getMax() {
        if (null == max || max <= 0)
            return DEFAULT_PAGE_SIZE;
        return max;
    }

    public Integer getCurrentPage() {
        if (null == currentPage || currentPage <= 0)
            return DEFAULT_CURRENT_PAGE;
        return this.currentPage;
    }

}
