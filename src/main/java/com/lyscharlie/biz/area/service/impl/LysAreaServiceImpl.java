package com.lyscharlie.biz.area.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyscharlie.biz.area.entity.LysAreaDO;
import com.lyscharlie.biz.area.mapper.LysAreaMapper;
import com.lyscharlie.biz.area.service.LysAreaService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class LysAreaServiceImpl implements LysAreaService {

	@Autowired
	private LysAreaMapper lysAreaMapper;

	@Override
	public boolean create(LysAreaDO area) {
		return this.lysAreaMapper.insert(area) > 0;
	}

	@Override
	public boolean save(LysAreaDO area) {
		return this.lysAreaMapper.updateById(area) > 0;
	}

	@Override
	public LysAreaDO queryById(long areaId) {
		return this.lysAreaMapper.selectById(areaId);
	}

	@Override
	public List<LysAreaDO> queryByPage(int pageNo, int pageSize, int areaLevel) {
		IPage<LysAreaDO> page = this.lysAreaMapper.selectPage(new Page<>(pageNo, pageSize), new LambdaQueryWrapper<LysAreaDO>().eq(LysAreaDO::getAreaLevel, areaLevel));
		return page.getRecords();
	}
}
