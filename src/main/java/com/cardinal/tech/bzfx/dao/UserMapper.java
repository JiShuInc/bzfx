package com.cardinal.tech.bzfx.dao;

import com.cardinal.tech.bzfx.bean.dbo.User;
import com.cardinal.tech.bzfx.bean.dbo.page.PageQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User findByUsername(@Param("username") String username);

    List<User> queryPageUserList(PageQuery pq);
}