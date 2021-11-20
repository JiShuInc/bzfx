package com.cardinal.tech.bzfx.entity;

import java.io.Serializable;
import lombok.Data;

@Data
/**
 * (JkApiUser)实体类
 *
 * @author makejava
 * @since 2021-11-20 19:22:42
 */
public class JkApiUser implements Serializable {
    private static final long serialVersionUID = 892015127805787178L;
    
    private Integer id;
    
    private Integer userId;
    
    private String userName;
    
    private Integer apiId;

}