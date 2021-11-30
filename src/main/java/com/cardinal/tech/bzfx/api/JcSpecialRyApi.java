package com.cardinal.tech.bzfx.api;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.entity.BzkTabRenyuanjbxx;
import com.cardinal.tech.bzfx.entity.JcSpecialRy;
import com.cardinal.tech.bzfx.service.JcSpecialRyService;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

/**
 * 专项任务人员(JcSpecialRy)表服务api接口
 *
 * @author makejava
 * @since 2021-11-20 18:42:52
 */
@Tag(name = "专项任务人员")
@RequestMapping("/jcSpecialRy")
public interface JcSpecialRyApi {

    JcSpecialRyService getService();

    @PreAuthorize("hasRole('admin')")
    @Operation(description = " get by sid")
    @GetMapping("/{sid}")
    default Response<Page<BzkTabRenyuanjbxx>> queryById(@RequestBody PageForm<JcSpecialRyPageForm> queryForm) {
        return new Response(getService().queryBySid(queryForm));
    }

    @Hidden
    @PreAuthorize("hasRole('admin')")
    @Operation(description = " get list")
    @GetMapping("/list")
    default Response<List<JcSpecialRyBO>> queryAllByLimit(@RequestParam(required = false) Integer offset, @RequestParam(required = false) Integer limit) {
        return new Response(getService().queryAllByLimit(offset, limit));
    }

    @PreAuthorize("hasRole('admin')")
    @Operation(description = " add")
    @PostMapping("/add")
    default Response<Void> insert(@RequestBody @Valid JcSpecialRyForm jcSpecialRy) {
        getService().addRy(jcSpecialRy);
        return new Response();
    }

    @Hidden
    @PreAuthorize("hasRole('admin')")
    @Operation(description = " update")
    @PostMapping("/update")
    default Response<JcSpecialRyBO> update(@RequestBody JcSpecialRy jcSpecialRy) {
        return new Response(getService().update(jcSpecialRy));
    }

    @PreAuthorize("hasRole('admin')")
    @Operation(description = " delete by pk")
    @GetMapping("/delete")
    default Response<Boolean> deleteById(@RequestParam Long sid, @RequestParam String rid) {
        return new Response(getService().deleteBySId(sid, rid));
    }

    @Hidden
    @PreAuthorize("hasRole('admin')")
    @Operation(description = " group by field name")
    @GetMapping("/group")
    default Response<List<Map<String, Integer>>> groupById(@RequestParam String field) {
        return new Response(getService().groupBy(field));
    }

    @Hidden
    @PreAuthorize("hasRole('admin')")
    @Operation(description = " page list")
    @PostMapping("/page")
    default Response<Page<JcSpecialRyBO>> page(@RequestBody PageForm<JcSpecialRy> userQueryForm) {
        return new Response(getService().page(userQueryForm));
    }
}