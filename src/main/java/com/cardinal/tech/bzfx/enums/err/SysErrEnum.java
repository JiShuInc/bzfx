package com.cardinal.tech.bzfx.enums.err;

import com.cardinal.tech.bzfx.enums.ErrEnumInterface;

/**
 * sys err enums
 */
public enum SysErrEnum implements ErrEnumInterface {
    SUCCESS(0, "成功"),
    SIGNIN_TIMEOUT(1, "token超时"),
    ACCESS_DENIED(2, "权限不足,拒绝访问!"),
    UNKOWN_ERR(-1, "发生错误"),
    UNSUPPORT_METHOD(3, "不支持的请求方法"),
    UNSUPPORT_MEDIATYPE(4, "不支持的媒体"),
    USER_NOT_EXISTS_OR_PASSWORD_ERR(5, "用户不存在或密码错误"),
    USER_EXISTS_ERR(6, "用户名已经存在"),
    PARAMETER_VALIDATE_ERR(7, "参数校验错误"),
    MAX_MUST_BEYOND_MIN_ERR(8, "最大数应该大于最小数"),
    END_MUST_BEYOND_START_ERR(9, "结束道必须大于开始道"),
    WAVEJPG_CREATE_ERR(10, "生成jpg出错"),
    DAT_FILE_NOT_EXIST(11, "dat数据文件不存在"),
    SHOCK_FILENAME_ERR(12, "震感文件命名错误,请按照yyyyMMdd_loc.csv 格式重新上传"),
    DAT_TAG_NAME_NULL(13, "tag 需要指定id或输入tag 名称"),
    DAT_DIR_NULL(14, "dat文件所在目录为空"),
    DATTAG_NULL(15, "dat tag关联记录为空")
    ;

    int code;
    String msg;

    SysErrEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public int code() {
        return this.code;
    }

    @Override
    public String msg() {
        return this.msg;
    }
}
