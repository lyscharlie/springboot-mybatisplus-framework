package com.lyscharlie.biz.area.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@Data
@TableName("lys_area")
public class LysAreaDO {

	/**
	 * 地区id
	 */
	@TableId(type = IdType.AUTO)
	private Long areaId;

	/**
	 * 地区名称
	 */
	private String areaName;

	/**
	 * 地区等级：1-国家，2-省，3-市，4-区/县/镇
	 */
	private Integer areaLevel;

	/**
	 * 地区信息
	 */
	private String areaInfo;

	/**
	 * 上级地区id
	 */
	private Long parentId;

	/**
	 * 状态：1-启用，2-停用
	 */
	private Integer status;

}
