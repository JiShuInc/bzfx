package com.cardinal.tech.bzfx.api;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.entity.BzkBzTabDaiyujb;
import com.cardinal.tech.bzfx.service.BzkBzTabDaiyujbService;
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
 * 待遇级别标准编码(BzkBzTabDaiyujb)表服务api接口
 *
 * @author makejava
 * @since 2021-11-25 15:22:54
 */
@Tag(name="待遇级别标准编码")
@RequestMapping("/bzkBzTabDaiyujb")
public interface BzkBzTabDaiyujbApi {

        BzkBzTabDaiyujbService getService();

        @PreAuthorize("permitAll()")
        @Operation(description = " get by id")
        @GetMapping("/{id}")
        default Response<BzkBzTabDaiyujb> queryById(@PathVariable("id") String id){
            return new Response(getService().queryById(id));
        }

        @PreAuthorize("permitAll()")
        @Operation(description = " get list")
        @GetMapping("/list")
       default Response<List<BzkBzTabDaiyujb>> queryAllByLimit(@RequestParam(required = false) Integer offset, @RequestParam(required = false) Integer limit){
            return new Response(getService().queryAllByLimit(offset,limit));
       }

        @PreAuthorize("permitAll()")
        @Operation(description = " add")
        @PostMapping("/add")
        default Response<BzkBzTabDaiyujb> insert(@RequestBody BzkBzTabDaiyujb bzkBzTabDaiyujb){
            return new Response(getService().insert(bzkBzTabDaiyujb));
        }

         @PreAuthorize("permitAll()")
         @Operation(description = " update")
         @PostMapping("/update")
        default Response<BzkBzTabDaiyujb> update(@RequestBody BzkBzTabDaiyujb bzkBzTabDaiyujb){
             return new Response(getService().update(bzkBzTabDaiyujb));
        }

        @PreAuthorize("permitAll()")
        @Operation(description = " delete by pk")
        @GetMapping("/delete")
       default Response<Boolean> deleteById(@RequestParam String id){
            return new Response(getService().deleteById(id));
        }

        @PreAuthorize("permitAll()")
        @Operation(description = " group by field name")
        @GetMapping("/group")
       default Response<List<Map<String,Integer>>> groupById(@RequestParam String field){
            return new Response(getService().groupBy(field));
        }

        @PreAuthorize("permitAll()")
        @Operation(description = " page list")
        @PostMapping("/page")
        default Response<Page<BzkBzTabDaiyujb>> page(@RequestBody PageForm<BzkBzTabDaiyujb> userQueryForm) {
           return new Response(getService().page(userQueryForm));
        }
}