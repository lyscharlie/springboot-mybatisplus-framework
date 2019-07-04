package com.lyscharlie.biz.area.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lyscharlie.Application;
import com.lyscharlie.biz.area.entity.LysArea;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class LysAreaServiceTest {

	@Autowired
	private LysAreaService lysAreaService;

	@Test
	public void create() {
	}

	@Test
	public void save() {
	}

	@Test
	public void queryById() {
		long id = 10L;

		LysArea area = this.lysAreaService.queryById(id);

		try {
			System.out.println(new ObjectMapper().writeValueAsString(area));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void queryByPage() {
		int pageNo = 1;
		int pageSize = 5;
		int areaLeval = 3;

		List<LysArea> list = this.lysAreaService.queryByPage(pageNo, pageSize, areaLeval);

		try {
			System.out.println(new ObjectMapper().writeValueAsString(list));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}
}