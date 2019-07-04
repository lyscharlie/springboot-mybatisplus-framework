package com.lyscharlie.biz.area.service;

import java.util.List;

import com.lyscharlie.biz.area.entity.LysArea;

public interface LysAreaService {

	boolean create(LysArea area);

	boolean save(LysArea area);

	LysArea queryById(long areaId);

	List<LysArea> queryByPage(int pageNo, int pageSize, int areaLevel);
}
