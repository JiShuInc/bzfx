package com.cardinal.tech.bzfx.api;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.entity.TjTongjifenxiSpecial;
import com.cardinal.tech.bzfx.service.TjTongjifenxiSpecialService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
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
 * 专项任务统计分析表(TjTongjifenxiSpecial)表服务api接口
 *
 * @author makejava
 * @since 2021-12-04 19:29:47
 */
@Tag(name="专项任务统计分析表")
@RequestMapping("/tjTongjifenxiSpecial")
public interface TjTongjifenxiSpecialApi {

        TjTongjifenxiSpecialService getService();

        @PreAuthorize("hasRole('admin')")
        @Operation(description = " get by id")
        @GetMapping("/{id}")
        default Response<TjTongjifenxiSpecial> queryById(@PathVariable("id") Long id){
            return new Response(getService().queryById(id));
        }

        @PreAuthorize("hasRole('admin')")
        @Operation(description = " get list")
        @GetMapping("/list")
       default Response<List<TjTongjifenxiSpecial>> queryAllByLimit(@RequestParam(required = false) Integer offset, @RequestParam(required = false) Integer limit){
            return new Response(getService().queryAllByLimit(offset,limit));
       }

        @PreAuthorize("hasRole('admin')")
        @Operation(description = " add")
        @PostMapping("/add")
        default Response<TjTongjifenxiSpecial> insert(@RequestBody TjTongjifenxiSpecial tjTongjifenxiSpecial){
            return new Response(getService().insert(tjTongjifenxiSpecial));
        }

         @PreAuthorize("hasRole('admin')")
         @Operation(description = " update")
         @PostMapping("/update")
        default Response<TjTongjifenxiSpecial> update(@RequestBody TjTongjifenxiSpecial tjTongjifenxiSpecial){
             return new Response(getService().update(tjTongjifenxiSpecial));
        }

        @PreAuthorize("hasRole('admin')")
        @Operation(description = " delete by pk")
        @GetMapping("/delete")
       default Response<Boolean> deleteById(@RequestParam Long id){
            return new Response(getService().deleteById(id));
        }

        @PreAuthorize("hasRole('admin')")
        @Operation(description = " group by field name")
        @GetMapping("/group")
       default Response<List<Map<String,Integer>>> groupById(@RequestParam String field){
            return new Response(getService().groupBy(field));
        }

        @PreAuthorize("hasRole('admin')")
        @Operation(description = " page list")
        @PostMapping("/page")
        default Response<Page<TjTongjifenxiSpecial>> page(@RequestBody PageForm<TjTongjifenxiSpecial> userQueryForm) {
           return new Response(getService().page(userQueryForm));
        }
}