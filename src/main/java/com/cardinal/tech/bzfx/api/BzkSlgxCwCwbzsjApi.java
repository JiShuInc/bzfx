package com.cardinal.tech.bzfx.api;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.entity.BzkSlgxCwCwbzsj;
import com.cardinal.tech.bzfx.service.BzkSlgxCwCwbzsjService;
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
 * 财务保障数据(BzkSlgxCwCwbzsj)表服务api接口
 *
 * @author makejava
 * @since 2021-11-20 16:06:13
 */
@Tag(name="财务保障数据")
@RequestMapping("/bzkSlgxCwCwbzsj")
public interface BzkSlgxCwCwbzsjApi {

        BzkSlgxCwCwbzsjService getService();

        @PreAuthorize("hasRole('admin')")
        @Operation(description = " get by id")
        @GetMapping("/{id}")
        default Response<BzkSlgxCwCwbzsj> queryById(@PathVariable("id") String id){
            return new Response(getService().queryById(id));
        }

        @PreAuthorize("hasRole('admin')")
        @Operation(description = " get list")
        @GetMapping("/list")
       default Response<List<BzkSlgxCwCwbzsj>> queryAllByLimit(@RequestParam(required = false) Integer offset, @RequestParam(required = false) Integer limit){
            return new Response(getService().queryAllByLimit(offset,limit));
       }

        @PreAuthorize("hasRole('admin')")
        @Operation(description = " add")
        @PostMapping("/add")
        default Response<BzkSlgxCwCwbzsj> insert(@RequestBody BzkSlgxCwCwbzsj bzkSlgxCwCwbzsj){
            return new Response(getService().insert(bzkSlgxCwCwbzsj));
        }

         @PreAuthorize("hasRole('admin')")
         @Operation(description = " update")
         @PostMapping("/update")
        default Response<BzkSlgxCwCwbzsj> update(@RequestBody BzkSlgxCwCwbzsj bzkSlgxCwCwbzsj){
             return new Response(getService().update(bzkSlgxCwCwbzsj));
        }

        @PreAuthorize("hasRole('admin')")
        @Operation(description = " delete by pk")
        @GetMapping("/delete")
       default Response<Boolean> deleteById(@RequestParam String id){
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
        default Response<Page<BzkSlgxCwCwbzsj>> page(@RequestBody PageForm<BzkSlgxCwCwbzsj> userQueryForm) {
           return new Response(getService().page(userQueryForm));
        }
}