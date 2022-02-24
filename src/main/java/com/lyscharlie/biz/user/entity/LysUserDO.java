package com.lyscharlie.biz.user.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

/**
 * @author CodeGenTool
 * @ClassName: LysUser
 * @Description: by CodeGenerate
 * @date 2019-7-5
 */
@Data
@TableName("lys_user")
public class LysUserDO {

	/**
	 * 用户id ( 主键 )
	 */
	@TableId(type = IdType.AUTO)
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