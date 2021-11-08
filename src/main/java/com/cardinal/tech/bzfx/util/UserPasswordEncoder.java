/**
 *
 */
package com.cardinal.tech.bzfx.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * 加密工具
 *
 * at 2016-7-7 上午10:09:49
 */
@Slf4j
public class UserPasswordEncoder implements PasswordEncoder {
    /**
     * 对字符串加密,加密算法使用MD5,SHA-256,默认使用SHA-256
     *
     * @param strSrc
     *            要加密的字符串
     * @return 加密后的字符串
     */
    public static String encrypt(String strSrc) {
        return ShaUtil.Encrypt(strSrc);
    }

    /**
     * 对字符串加密,加密算法使用MD5,SHA-256,默认使用SHA-256
     *
     * @param strSrc
     * @param algorithm
     *            MD5,SHA-256,
     * @return
     */
    public static String encrypt(String strSrc, String algorithm) {
        if (algorithm.equalsIgnoreCase("MD5")) {
            return Md5Util.MD5(strSrc);
        }
        return ShaUtil.Encrypt(strSrc);
    }

    @Override
    public String encode(CharSequence rawPassword) {
        if (rawPassword == null) {
            throw new IllegalArgumentException("password cannot be null");
        }
        return encrypt(rawPassword.toString());
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        if (rawPassword == null) {
            throw new IllegalArgumentException("password cannot be null");
        }

        if (encodedPassword == null || encodedPassword.length() == 0) {
            log.warn("Empty encoded password");
            return false;
        }
        return encode(rawPassword).equals(encodedPassword);
    }

    @Override
    public boolean upgradeEncoding(String encodedPassword) {
        return false;
    }
}
