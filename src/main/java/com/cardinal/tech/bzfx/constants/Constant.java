package com.cardinal.tech.bzfx.constants;

import java.util.UUID;

public class Constant {
    public static final String USER_ID = "user_id";
    public static final String ROLE_ID = "role_id";
    public static final String SECRET_KEY = UUID.randomUUID().toString();
    public static final String TOKEN_HEAD = "authorization";
    /**
     * default timeout 4 hours
     */
    public static final int DEFAULT_TOKE_TIMEOUT = 60 * 24*365;

}
