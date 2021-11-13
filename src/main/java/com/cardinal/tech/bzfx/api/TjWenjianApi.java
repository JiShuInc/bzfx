package com.cardinal.tech.bzfx.api;

import com.cardinal.tech.bzfx.bean.bo.*;
import com.cardinal.tech.bzfx.entity.TjWenjian;
import com.cardinal.tech.bzfx.service.TjWenjianService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * 上传文件表(TjWenjian)表服务api接口
 *
 * @author cadinal.tech
 * @since 2021-11-13 21:10:08
 */
@Tag(name = "上传文件表")
@RequestMapping("/tjWenjian")
public interface TjWenjianApi {

    TjWenjianService getService();


    @PreAuthorize("hasRole('admin')")
    @Operation(description = " get list")
    @GetMapping("/list")
    default Response<List<TjWenjian>> queryAllByLimit(@RequestParam(required = false) Integer offset, @RequestParam(required = false) Integer limit) {
        return new Response(getService().queryAllByLimit(offset, limit));
    }

    @PreAuthorize("hasRole('admin')")
    @Operation(description = " delete by pk")
    @GetMapping("/delete")
    default Response<Boolean> deleteById(@RequestParam Long id) {
        return new Response(getService().deleteById(id));
    }


    @PreAuthorize("hasRole('admin')")
    @Operation(description = " page list")
    @PostMapping("/page")
    default Response<Page<TjWenjian>> page(@RequestBody PageForm<TjWenjian> userQueryForm) {
        return new Response(getService().page(userQueryForm));
    }



    @PreAuthorize("hasRole('admin')")
    @Operation(description = " upload file")
    @PostMapping("/upload")
    default Response<TjWenjian> upload(@RequestParam MultipartFile file) {
        return new Response(getService().upload(file));
    }

    @PreAuthorize("hasRole('admin')")
    @Operation(description = "download file")
    @GetMapping("/{id}")
    default void download(@PathVariable("id") Long id, HttpServletResponse response) {
        getService().download(id, response);
    }

}