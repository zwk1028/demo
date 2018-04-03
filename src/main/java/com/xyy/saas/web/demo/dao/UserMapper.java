package com.xyy.saas.web.demo.dao;

import java.util.List;
import com.xyy.saas.web.demo.po.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by wangzhenyu on 2018/4/2.
 */
@Mapper
public interface UserMapper{
    User findUserById(Integer id);
    int insert(User user);
    List<User> fundUser();
}
