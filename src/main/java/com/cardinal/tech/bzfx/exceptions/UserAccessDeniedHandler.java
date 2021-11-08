package com.cardinal.tech.bzfx.exceptions;

import com.cardinal.tech.bzfx.enums.err.SysErrEnum;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class UserAccessDeniedHandler extends BaseSecurityHandler implements AccessDeniedHandler {
    private final ObjectMapper objectMapper;

    public UserAccessDeniedHandler(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException, ServletException {
        this.setObjectMapper(objectMapper);
        write(response, SysErrEnum.ACCESS_DENIED, HttpStatus.FORBIDDEN);
    }
}
