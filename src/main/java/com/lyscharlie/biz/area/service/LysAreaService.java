package com.lyscharlie.biz.area.service;

import java.util.List;

import com.lyscharlie.biz.area.entity.LysAreaDO;

public interface LysAreaService {

	boolean create(LysAreaDO area);

	boolean save(LysAreaDO area);

	LysAreaDO queryById(long areaId);

	List<LysAreaDO> queryByPage(int pageNo, int pageSize, int areaLevel);
}
