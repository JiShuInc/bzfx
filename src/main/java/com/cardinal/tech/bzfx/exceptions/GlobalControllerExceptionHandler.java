package com.cardinal.tech.bzfx.exceptions;

import com.cardinal.tech.bzfx.enums.err.SysErrEnum;
import com.cardinal.tech.bzfx.bean.bo.Response;
import io.swagger.v3.oas.annotations.Hidden;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
@Slf4j
@Hidden
public class GlobalControllerExceptionHandler {

    @ExceptionHandler(UsernameNotFoundException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public Response<Void> handleUserNameNotFound(UsernameNotFoundException e) {
        log.warn("{}", e.getMessage());
        return new Response<>(SysErrEnum.USER_NOT_EXISTS_OR_PASSWORD_ERR);
    }

    @ExceptionHandler(BaseErrException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Response<Void> handleBaseErr(BaseErrException e) {
        log.warn(e.getMessage());
        return new Response<>(e.getErrEnum(),e.getMessage());
    }

    @ExceptionHandler(HttpMediaTypeNotSupportedException.class)
    @ResponseStatus(HttpStatus.UNSUPPORTED_MEDIA_TYPE)
    public Response<Void> handleMediaTypeNotSupported(HttpMediaTypeNotSupportedException e) {
        log.warn("not support mediaType {} !", e.getContentType());
        return new Response<>(SysErrEnum.UNSUPPORT_MEDIATYPE);
    }

    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    @ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
    public Response<Void> handleHttpRequestMethodNotSupportedException(HttpRequestMethodNotSupportedException e) {
        log.warn("not support http method {} !", e.getMethod());
        return new Response<>(SysErrEnum.UNSUPPORT_METHOD);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Response<Void> handleFormBindException(MethodArgumentNotValidException e) {
        return new Response<>(e.getBindingResult().getAllErrors().get(0).getDefaultMessage());
    }

    @ExceptionHandler(AccessDeniedException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public Response<Void> handleAccessDeniedException(AccessDeniedException e) {
        return new Response<>(SysErrEnum.ACCESS_DENIED);
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Response<Void> handleOtherErr(Exception e) {
        log.error("program is err with :", e);
        return new Response<>(SysErrEnum.UNKOWN_ERR);
    }
}
