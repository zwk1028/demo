package com.xyy.saas.web.demo;

import com.github.pagehelper.PageInfo;
import com.xyy.saas.web.demo.po.User;
import com.xyy.saas.web.demo.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestStart.class)
public class UserTests {
	@Autowired
	UserService userService;
	@Test
	public void findPage() {
		PageInfo info=new PageInfo();
		info.setPageNum(2);
		info.setPageSize(2);
		PageInfo<User> pageInfo = userService.findPageInfo(info);
		//Assert.assertEquals(pageInfo.getTotal(),5L);
	}
	@Test
	public void findById(){
		User user=userService.findById(1);
		Assert.assertEquals(user.getId(),new Integer(1));
	}
	@Test
	public void insert(){
		User user=new User();
		user.setName("wang");
		System.out.println();
		userService.insert(user);
		Assert.assertNotEquals(user.getId(),null);
	}

}
