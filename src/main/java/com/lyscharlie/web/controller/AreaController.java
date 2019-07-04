package com.lyscharlie.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lyscharlie.biz.area.entity.LysArea;
import com.lyscharlie.biz.area.service.LysAreaService;

@RestController
@RequestMapping("/area")
public class AreaController {

	@Autowired
	private LysAreaService lysAreaService;

	@GetMapping("queryById.htm")
	public LysArea queryById(@RequestParam("id") long id) {
		return this.lysAreaService.queryById(id);
	}
}
