package com.cardinal.tech.bzfx.api;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.entity.JkApi;
import com.cardinal.tech.bzfx.service.JkApiService;
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
 * 接口(JkApi)表服务api接口
 *
 * @author cadinal.tech
 * @since 2021-11-13 01:33:38
 */
@Tag(name="接口")
@RequestMapping("/jkApi")
public interface JkApiApi {

        JkApiService getService();

        @PreAuthorize("hasRole('admin')")
        @Operation(description = " get by id")
        @GetMapping("/{id}")
        default Response<JkApi> queryById(@PathVariable("id") Long id){
            return new Response(getService().queryById(id));
        }

        @PreAuthorize("hasRole('admin')")
        @Operation(description = " get list")
        @GetMapping("/list")
       default Response<List<JkApi>> queryAllByLimit(@RequestParam(required = false) Integer offset, @RequestParam(required = false) Integer limit){
            return new Response(getService().queryAllByLimit(offset,limit));
       }

        @PreAuthorize("hasRole('admin')")
        @Operation(description = " add")
        @PostMapping("/add")
        default Response<JkApi> insert(@RequestBody JkApi jkApi){
            return new Response(getService().insert(jkApi));
        }

         @PreAuthorize("hasRole('admin')")
         @Operation(description = " update")
         @PostMapping("/update")
        default Response<JkApi> update(@RequestBody JkApi jkApi){
             return new Response(getService().update(jkApi));
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
        default Response<Page<JkApi>> page(@RequestBody PageForm<JkApi> userQueryForm) {
           return new Response(getService().page(userQueryForm));
        }
}