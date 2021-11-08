package com.cardinal.tech.bzfx.bean.bo;

import com.cardinal.tech.bzfx.enums.ErrEnumInterface;
import com.cardinal.tech.bzfx.enums.err.SysErrEnum;
import lombok.Data;

@Data
public class Response<T> {
    private int code;
    private String msg;
    private T t;

    public Response() {
        this(SysErrEnum.SUCCESS);
    }

    public Response(ErrEnumInterface errEnum) {
        this.code = errEnum.code();
        this.msg = errEnum.msg();
    }

    public Response(ErrEnumInterface errEnum, String msg) {
        this.code = errEnum.code();
        this.msg = msg;
    }

    public Response(String msg) {
        this.code = SysErrEnum.PARAMETER_VALIDATE_ERR.code();
        this.msg = msg;
    }

    public Response(T t) {
        this();
        this.t = t;
    }
}
