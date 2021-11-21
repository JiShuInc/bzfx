package com.cardinal.tech.bzfx.api;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.entity.BzkBzTabJicengyljg;
import com.cardinal.tech.bzfx.entity.BzkSlgxBzBzdaxx;
import com.cardinal.tech.bzfx.service.BzkBzTabJicengyljgService;
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
 * 体系医院标准编码(BzkBzTabJicengyljg)表服务api接口
 *
 * @author makejava
 * @since 2021-11-20 23:59:46
 */
@Tag(name="体系医院标准编码")
@RequestMapping("/bzkBzTabJicengyljg")
public interface BzkBzTabJicengyljgApi {

        int API_ID = 9;

        BzkBzTabJicengyljgService getService();

        @PreAuthorize("hasRole('admin')")
        @Operation(description = " get by id")
        @GetMapping("/{id}")
        default Response<BzkBzTabJicengyljg> queryById(@PathVariable("id") String id){
            return new Response(getService().queryById(id));
        }

        @PreAuthorize("hasRole('admin')")
        @Operation(description = " get list")
        @GetMapping("/list")
       default Response<List<BzkBzTabJicengyljg>> queryAllByLimit(@RequestParam(required = false) Integer offset, @RequestParam(required = false) Integer limit){
            return new Response(getService().queryAllByLimit(offset,limit));
       }

        @PreAuthorize("hasRole('admin')")
        @Operation(description = " add")
        @PostMapping("/add")
        default Response<BzkBzTabJicengyljg> insert(@RequestBody BzkBzTabJicengyljg bzkBzTabJicengyljg){
            return new Response(getService().insert(bzkBzTabJicengyljg));
        }

         @PreAuthorize("hasRole('admin')")
         @Operation(description = " update")
         @PostMapping("/update")
        default Response<BzkBzTabJicengyljg> update(@RequestBody BzkBzTabJicengyljg bzkBzTabJicengyljg){
             return new Response(getService().update(bzkBzTabJicengyljg));
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
        default Response<Page<BzkBzTabJicengyljg>> page(@RequestBody PageForm<BzkBzTabJicengyljg> userQueryForm) {
           return new Response(getService().page(userQueryForm));
        }

        @PreAuthorize("hasRole('access_api')")
        @Operation(description = " page list")
        @PostMapping("/pageList")
        default Response<Page<BzkBzTabJicengyljg>> pageList(@RequestBody PageForm<BzkBzTabJicengyljg> userQueryForm) {
            return new Response(getService().page(userQueryForm));
        }
}