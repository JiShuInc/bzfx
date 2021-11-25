package com.cardinal.tech.bzfx.api;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.entity.BzkBzTabRenyuanlb;
import com.cardinal.tech.bzfx.service.BzkBzTabRenyuanlbService;
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
 * 人员类别(BzkBzTabRenyuanlb)表服务api接口
 *
 * @author makejava
 * @since 2021-11-25 15:22:57
 */
@Tag(name="人员类别")
@RequestMapping("/bzkBzTabRenyuanlb")
public interface BzkBzTabRenyuanlbApi {

        BzkBzTabRenyuanlbService getService();

        @PreAuthorize("hasRole('admin')")
        @Operation(description = " get by id")
        @GetMapping("/{id}")
        default Response<BzkBzTabRenyuanlb> queryById(@PathVariable("id") String id){
            return new Response(getService().queryById(id));
        }

        @PreAuthorize("hasRole('admin')")
        @Operation(description = " get list")
        @GetMapping("/list")
       default Response<List<BzkBzTabRenyuanlb>> queryAllByLimit(@RequestParam(required = false) Integer offset, @RequestParam(required = false) Integer limit){
            return new Response(getService().queryAllByLimit(offset,limit));
       }

        @PreAuthorize("hasRole('admin')")
        @Operation(description = " add")
        @PostMapping("/add")
        default Response<BzkBzTabRenyuanlb> insert(@RequestBody BzkBzTabRenyuanlb bzkBzTabRenyuanlb){
            return new Response(getService().insert(bzkBzTabRenyuanlb));
        }

         @PreAuthorize("hasRole('admin')")
         @Operation(description = " update")
         @PostMapping("/update")
        default Response<BzkBzTabRenyuanlb> update(@RequestBody BzkBzTabRenyuanlb bzkBzTabRenyuanlb){
             return new Response(getService().update(bzkBzTabRenyuanlb));
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
        default Response<Page<BzkBzTabRenyuanlb>> page(@RequestBody PageForm<BzkBzTabRenyuanlb> userQueryForm) {
           return new Response(getService().page(userQueryForm));
        }
}