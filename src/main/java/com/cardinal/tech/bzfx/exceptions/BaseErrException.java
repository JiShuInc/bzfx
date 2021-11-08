package com.cardinal.tech.bzfx.exceptions;

import com.cardinal.tech.bzfx.enums.ErrEnumInterface;
import lombok.Data;

@Data
public class BaseErrException extends RuntimeException {
    private ErrEnumInterface errEnum;

    public BaseErrException(ErrEnumInterface errEnum, String message) {
        super(message+" "+errEnum.msg());
        this.errEnum = errEnum;
    }
}
