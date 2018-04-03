package com.xyy.saas.web.demo.service;

import com.github.pagehelper.PageInfo;
import com.xyy.saas.web.demo.po.User;

/**
 * Created by wangzhenyu on 2018/4/2.
 */
public interface UserService {
    PageInfo<User> findPageInfo(PageInfo pageInfo);
    int insert(User user);
    User findById(Integer id);
}
