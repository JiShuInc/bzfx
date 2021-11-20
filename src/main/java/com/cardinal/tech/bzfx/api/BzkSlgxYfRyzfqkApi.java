package com.cardinal.tech.bzfx.api;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.entity.BzkSlgxYfRyzfqk;
import com.cardinal.tech.bzfx.service.BzkSlgxYfRyzfqkService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 人员住房情况(BzkSlgxYfRyzfqk)表服务api接口
 *
 * @author makejava
 * @since 2021-11-20 16:06:13
 */
@Tag(name = "人员住房情况")
@RequestMapping("/bzkSlgxYfRyzfqk")
public interface BzkSlgxYfRyzfqkApi extends BaseApi {

    BzkSlgxYfRyzfqkService getService();

    int API_ID = 4;

    @PreAuthorize("hasRole('admin')")
    @Operation(description = " get by id")
    @GetMapping("/{id}")
    default Response<BzkSlgxYfRyzfqk> queryById(@PathVariable("id") String id) {
        return new Response(getService().queryById(id));
    }

    @PreAuthorize("hasRole('admin')")
    @Operation(description = " get list")
    @GetMapping("/list")
    default Response<List<BzkSlgxYfRyzfqk>> queryAllByLimit(@RequestParam(required = false) Integer offset, @RequestParam(required = false) Integer limit) {
        return new Response(getService().queryAllByLimit(offset, limit));
    }

    @PreAuthorize("hasRole('admin')")
    @Operation(description = " add")
    @PostMapping("/add")
    default Response<BzkSlgxYfRyzfqk> insert(@RequestBody BzkSlgxYfRyzfqk bzkSlgxYfRyzfqk) {
        return new Response(getService().insert(bzkSlgxYfRyzfqk));
    }

    @PreAuthorize("hasRole('admin')")
    @Operation(description = " update")
    @PostMapping("/update")
    default Response<BzkSlgxYfRyzfqk> update(@RequestBody BzkSlgxYfRyzfqk bzkSlgxYfRyzfqk) {
        return new Response(getService().update(bzkSlgxYfRyzfqk));
    }

    @PreAuthorize("hasRole('admin')")
    @Operation(description = " delete by pk")
    @GetMapping("/delete")
    default Response<Boolean> deleteById(@RequestParam String id) {
        return new Response(getService().deleteById(id));
    }

    @PreAuthorize("hasRole('admin')")
    @Operation(description = " group by field name")
    @GetMapping("/group")
    default Response<List<Map<String, Integer>>> groupById(@RequestParam String field) {
        return new Response(getService().groupBy(field));
    }

    @PreAuthorize("hasRole('admin')")
    @Operation(description = " page list")
    @PostMapping("/page")
    default Response<Page<BzkSlgxYfRyzfqk>> page(@RequestBody PageForm<BzkSlgxYfRyzfqk> userQueryForm) {
        return new Response(getService().page(userQueryForm));
    }

    @PreAuthorize("hasRole('api_access')")
    @Operation(description = " page list")
    @PostMapping("/pageList")
    default Response<Page<BzkSlgxYfRyzfqk>> pageList(@RequestBody PageForm<BzkSlgxYfRyzfqk> userQueryForm) {
        if (!checkApiAccess(API_ID)) {
            throw new AccessDeniedException("不允许访问");
        }
        return new Response(getService().page(userQueryForm));
    }
}