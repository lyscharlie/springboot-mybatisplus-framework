package com.lyscharlie.biz.user.service;

import java.util.Date;

import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.lyscharlie.SpringbootMybatisplusFrameworkApplication;
import com.lyscharlie.biz.user.entity.LysUserDO;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootMybatisplusFrameworkApplication.class)
public class LysUserServiceTest {

	@Autowired
	private LysUserService lysUserService;

	@Test
	public void testCraete() {
		LysUserDO user = new LysUserDO();
		user.setUserName("test-" + System.currentTimeMillis());
		user.setPassword(DigestUtils.md5Hex("123456"));
		user.setEmail("aaaa@abc.com");
		user.setMobile("12312345678");
		user.setLastLoginTime(new Date());
		user.setGmtCreate(new Date());
		user.setGmtModified(new Date());

		Assert.assertTrue(this.lysUserService.save(user));
	}

}