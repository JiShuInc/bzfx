package com.cardinal.tech.bzfx.api;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.entity.BzkBzTabDwxxdz;
import com.cardinal.tech.bzfx.service.BzkBzTabDwxxdzService;
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
 * 单位信息对照(BzkBzTabDwxxdz)表服务api接口
 *
 * @author makejava
 * @since 2021-11-25 15:22:55
 */
@Tag(name="单位信息对照")
@RequestMapping("/bzkBzTabDwxxdz")
public interface BzkBzTabDwxxdzApi {

        BzkBzTabDwxxdzService getService();

        @PreAuthorize("permitAll()")
        @Operation(description = " get by id")
        @GetMapping("/{id}")
        default Response<BzkBzTabDwxxdz> queryById(@PathVariable("id") String id){
            return new Response(getService().queryById(id));
        }

        @PreAuthorize("permitAll()")
        @Operation(description = " get list")
        @GetMapping("/list")
       default Response<List<BzkBzTabDwxxdz>> queryAllByLimit(@RequestParam(required = false) Integer offset, @RequestParam(required = false) Integer limit){
            return new Response(getService().queryAllByLimit(offset,limit));
       }

        @PreAuthorize("permitAll()")
        @Operation(description = " add")
        @PostMapping("/add")
        default Response<BzkBzTabDwxxdz> insert(@RequestBody BzkBzTabDwxxdz bzkBzTabDwxxdz){
            return new Response(getService().insert(bzkBzTabDwxxdz));
        }

         @PreAuthorize("permitAll()")
         @Operation(description = " update")
         @PostMapping("/update")
        default Response<BzkBzTabDwxxdz> update(@RequestBody BzkBzTabDwxxdz bzkBzTabDwxxdz){
             return new Response(getService().update(bzkBzTabDwxxdz));
        }

        @PreAuthorize("permitAll()")
        @Operation(description = " delete by pk")
        @GetMapping("/delete")
       default Response<Boolean> deleteById(@RequestParam String danweiid){
            return new Response(getService().deleteById(danweiid));
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
        default Response<Page<BzkBzTabDwxxdz>> page(@RequestBody PageForm<BzkBzTabDwxxdz> userQueryForm) {
           return new Response(getService().page(userQueryForm));
        }
}