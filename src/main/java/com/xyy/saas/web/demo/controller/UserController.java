package com.xyy.saas.web.demo.controller;

import com.xyy.saas.web.base.ResultVO;
import com.xyy.saas.web.config.UrlConfig;
import com.xyy.saas.web.demo.po.User;
import com.xyy.saas.web.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangzhenyu on 2018/4/2.
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    UserService userService;
    @Autowired
    UrlConfig urlConfig;
    @RequestMapping("/get/{id}")
    public ResultVO<User> getById(@PathVariable(value = "id") Integer id){
        logger.error("port:"+urlConfig.getPort());
        return ResultVO.createSuccess(userService.findById(id));
    }
}
