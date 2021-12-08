package com.cardinal.tech.bzfx.api;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.entity.BzkBzTabJicengyljgls;
import com.cardinal.tech.bzfx.service.BzkBzTabJicengyljglsService;
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
 * 体系医院历史表(BzkBzTabJicengyljgls)表服务api接口
 *
 * @author makejava
 * @since 2021-11-25 15:22:56
 */
@Tag(name="体系医院历史表")
@RequestMapping("/bzkBzTabJicengyljgls")
public interface BzkBzTabJicengyljglsApi {

        BzkBzTabJicengyljglsService getService();

        @PreAuthorize("permitAll()")
        @Operation(description = " get by id")
        @GetMapping("/{id}")
        default Response<BzkBzTabJicengyljgls> queryById(@PathVariable("id") String id){
            return new Response(getService().queryById(id));
        }

        @PreAuthorize("permitAll()")
        @Operation(description = " get list")
        @GetMapping("/list")
       default Response<List<BzkBzTabJicengyljgls>> queryAllByLimit(@RequestParam(required = false) Integer offset, @RequestParam(required = false) Integer limit){
            return new Response(getService().queryAllByLimit(offset,limit));
       }

        @PreAuthorize("permitAll()")
        @Operation(description = " add")
        @PostMapping("/add")
        default Response<BzkBzTabJicengyljgls> insert(@RequestBody BzkBzTabJicengyljgls bzkBzTabJicengyljgls){
            return new Response(getService().insert(bzkBzTabJicengyljgls));
        }

         @PreAuthorize("permitAll()")
         @Operation(description = " update")
         @PostMapping("/update")
        default Response<BzkBzTabJicengyljgls> update(@RequestBody BzkBzTabJicengyljgls bzkBzTabJicengyljgls){
             return new Response(getService().update(bzkBzTabJicengyljgls));
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
        default Response<Page<BzkBzTabJicengyljgls>> page(@RequestBody PageForm<BzkBzTabJicengyljgls> userQueryForm) {
           return new Response(getService().page(userQueryForm));
        }
}