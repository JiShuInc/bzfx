package com.cardinal.tech.bzfx.api;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.entity.TaskBzkTabRenyuanjbxx;
import com.cardinal.tech.bzfx.service.TaskBzkTabRenyuanjbxxService;
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
 * 人员基本信息(TaskBzkTabRenyuanjbxx)表服务api接口
 *
 * @author makejava
 * @since 2021-11-28 12:40:57
 */
@Tag(name="人员基本信息")
@RequestMapping("/taskBzkTabRenyuanjbxx")
public interface TaskBzkTabRenyuanjbxxApi {

        TaskBzkTabRenyuanjbxxService getService();

        @PreAuthorize("hasRole('admin')")
        @Operation(description = " get by id")
        @GetMapping("/{id}")
        default Response<TaskBzkTabRenyuanjbxx> queryById(@PathVariable("id") Long id){
            return new Response(getService().queryById(id));
        }

        @PreAuthorize("hasRole('admin')")
        @Operation(description = " get list")
        @GetMapping("/list")
       default Response<List<TaskBzkTabRenyuanjbxx>> queryAllByLimit(@RequestParam(required = false) Integer offset, @RequestParam(required = false) Integer limit){
            return new Response(getService().queryAllByLimit(offset,limit));
       }

        @PreAuthorize("hasRole('admin')")
        @Operation(description = " add")
        @PostMapping("/add")
        default Response<TaskBzkTabRenyuanjbxx> insert(@RequestBody TaskBzkTabRenyuanjbxx taskBzkTabRenyuanjbxx){
            return new Response(getService().insert(taskBzkTabRenyuanjbxx));
        }

         @PreAuthorize("hasRole('admin')")
         @Operation(description = " update")
         @PostMapping("/update")
        default Response<TaskBzkTabRenyuanjbxx> update(@RequestBody TaskBzkTabRenyuanjbxx taskBzkTabRenyuanjbxx){
             return new Response(getService().update(taskBzkTabRenyuanjbxx));
        }

        @PreAuthorize("hasRole('admin')")
        @Operation(description = " delete by pk")
        @GetMapping("/delete")
       default Response<Boolean> deleteById(@RequestParam Long taskid){
            return new Response(getService().deleteById(taskid));
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
        default Response<Page<TaskBzkTabRenyuanjbxx>> page(@RequestBody PageForm<TaskBzkTabRenyuanjbxx> userQueryForm) {
           return new Response(getService().page(userQueryForm));
        }
}