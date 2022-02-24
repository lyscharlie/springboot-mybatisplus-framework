package com.lyscharlie.biz.user.bo;

import java.util.Date;

import com.lyscharlie.common.bo.BaseQueryBO;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author CodeGenTool
 * @ClassName: LysUser查询BO
 * @Description: by CodeGenerate
 * @date 2019-7-5
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class QueryLysUserBO extends BaseQueryBO {

	private static final long serialVersionUID = -1158048628420776225L;
	/**
	 * 用户id ( 主键 )
	 */
	private Long userId;
	/**
	 * 用户名
	 */
	private String userName;
	/**
	 * 用户密码
	 */
	private String password;
	/**
	 * 邮箱
	 */
	private String email;
	/**
	 * 手机号
	 */
	private String mobile;
	/**
	 * 推荐人id
	 */
	private Long registerReferId;
	/**
	 * 最近一次登录时间
	 */
	private Date lastLoginTime;
	/**
	 * 创建时间
	 */
	private Date gmtCreate;
	/**
	 * 最后修改时间
	 */
	private Date gmtModified;

	/* -------------------- 非DB字段 -------------------- */
}