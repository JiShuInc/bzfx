package com.cardinal.tech.bzfx.api;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.entity.TjGongziff;
import com.cardinal.tech.bzfx.service.TjGongziffService;
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
 * 工资发放表(TjGongziff)表服务api接口
 *
 * @author cadinal.tech
 * @since 2021-11-13 01:33:38
 */
@Tag(name="工资发放表")
@RequestMapping("/tjGongziff")
public interface TjGongziffApi {

        TjGongziffService getService();

        @PreAuthorize("hasRole('admin')")
        @Operation(description = " get by id")
        @GetMapping("/{id}")
        default Response<TjGongziff> queryById(@PathVariable("id") Long id){
            return new Response(getService().queryById(id));
        }

        @PreAuthorize("hasRole('admin')")
        @Operation(description = " get list")
        @GetMapping("/list")
       default Response<List<TjGongziff>> queryAllByLimit(@RequestParam(required = false) Integer offset, @RequestParam(required = false) Integer limit){
            return new Response(getService().queryAllByLimit(offset,limit));
       }

        @PreAuthorize("hasRole('admin')")
        @Operation(description = " add")
        @PostMapping("/add")
        default Response<TjGongziff> insert(@RequestBody TjGongziff tjGongziff){
            return new Response(getService().insert(tjGongziff));
        }

         @PreAuthorize("hasRole('admin')")
         @Operation(description = " update")
         @PostMapping("/update")
        default Response<TjGongziff> update(@RequestBody TjGongziff tjGongziff){
             return new Response(getService().update(tjGongziff));
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
       default Response<List<Map<String,Integer>>> deleteById(@RequestParam String field){
            return new Response(getService().groupBy(field));
        }

        @PreAuthorize("hasRole('admin')")
        @Operation(description = " page list")
        @PostMapping("/page")
        default Response<Page<TjGongziff>> page(@RequestBody PageForm<TjGongziff> userQueryForm) {
           return new Response(getService().page(userQueryForm));
        }
}