package com.cardinal.tech.bzfx.exceptions;

import com.cardinal.tech.bzfx.enums.err.SysErrEnum;
import com.cardinal.tech.bzfx.bean.bo.Response;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Data
public class BaseSecurityHandler {
    private ObjectMapper objectMapper;

    public void write(HttpServletResponse response, SysErrEnum errEnum, HttpStatus status) throws IOException {
        Response res = new Response(errEnum);
        response.setStatus(status.value());
        response.setCharacterEncoding("UTF-8");
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
        var resStr = objectMapper.writeValueAsString(res);
        try (PrintWriter writer = response.getWriter()) {
            writer.print(resStr);
            writer.flush();
        }
    }
}
