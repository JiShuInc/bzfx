package com.cardinal.tech.bzfx.api;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.entity.TaskBzkTabDanweijbxx;
import com.cardinal.tech.bzfx.service.TaskBzkTabDanweijbxxService;
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
 * 单位基本信息(TaskBzkTabDanweijbxx)表服务api接口
 *
 * @author makejava
 * @since 2021-11-28 12:40:57
 */
@Tag(name="单位基本信息")
@RequestMapping("/taskBzkTabDanweijbxx")
public interface TaskBzkTabDanweijbxxApi {

        TaskBzkTabDanweijbxxService getService();

        @PreAuthorize("permitAll()")
        @Operation(description = " get by id")
        @GetMapping("/{id}")
        default Response<TaskBzkTabDanweijbxx> queryById(@PathVariable("id") Long id){
            return new Response(getService().queryById(id));
        }

        @PreAuthorize("permitAll()")
        @Operation(description = " get list")
        @GetMapping("/list")
       default Response<List<TaskBzkTabDanweijbxx>> queryAllByLimit(@RequestParam(required = false) Integer offset, @RequestParam(required = false) Integer limit){
            return new Response(getService().queryAllByLimit(offset,limit));
       }

        @PreAuthorize("permitAll()")
        @Operation(description = " add")
        @PostMapping("/add")
        default Response<TaskBzkTabDanweijbxx> insert(@RequestBody TaskBzkTabDanweijbxx taskBzkTabDanweijbxx){
            return new Response(getService().insert(taskBzkTabDanweijbxx));
        }

         @PreAuthorize("permitAll()")
         @Operation(description = " update")
         @PostMapping("/update")
        default Response<TaskBzkTabDanweijbxx> update(@RequestBody TaskBzkTabDanweijbxx taskBzkTabDanweijbxx){
             return new Response(getService().update(taskBzkTabDanweijbxx));
        }

        @PreAuthorize("permitAll()")
        @Operation(description = " delete by pk")
        @GetMapping("/delete")
       default Response<Boolean> deleteById(@RequestParam Long taskid){
            return new Response(getService().deleteById(taskid));
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
        default Response<Page<TaskBzkTabDanweijbxx>> page(@RequestBody PageForm<TaskBzkTabDanweijbxx> userQueryForm) {
           return new Response(getService().page(userQueryForm));
        }
}