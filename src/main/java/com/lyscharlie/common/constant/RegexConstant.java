package com.lyscharlie.common.constant;

/**
 * 正则表达式常量
 * 
 * @author LiYishi
 */
public interface RegexConstant {

	/**
	 * 通用
	 * 
	 * @author LiYishi
	 */
	interface COMMON {

		/** 中文字符 */
		String CHINESE_CHARACTER = "[\\u4e00-\\u9fa5]";

		/** 双字节字符(包括汉字在内) */
		String DOUBLE_CHARACTER = "[^\\x00-\\xff]";

		/** 空白行 */
		String BLANK_LINE = "\\n\\s*\\r";

		/** Email地址 */
		String EMAIL = "[\\w!#$%&'*+/=?^_`{|}~-]+(?:\\.[\\w!#$%&'*+/=?^_`{|}~-]+)*@(?:[\\w](?:[\\w-]*[\\w])?\\.)+[\\w](?:[\\w-]*[\\w])?";

		/** 网址URL */
		String URL = "[a-zA-z]+://[^\\s]*";

		/** 国内电话号码 */
		String TELEPHONE = "\\d{3}-\\d{8}|\\d{4}-\\{7,8}";

		/** 国内手机号码 */
		String MOBILE = "^(1[2-9][0-9])\\d{8}$";

		/** 腾讯QQ号 */
		String QQ = "[1-9][0-9]{4,}";

		/** 中国邮政编码 */
		String POSTCODE = "[1-9]\\d{5}(?!\\d";

		/** 18位身份证号 */
		String IDENTIFICATION_CARD = "^(\\d{6})(\\d{4})(\\d{2})(\\d{2})(\\d{3})([0-9]|[Xx])$";

		/** 身份证号(15,18位) */
		String IDENTIFICATION_CARD_ALL = "^(\\d{15}$|^\\d{18}$|^\\d{17}(\\d|X|x))$";

		/** 护照 */
		String NORMAL_PASSPORT = "^[a-zA-Z0-9\\(\\)]{5,17}$";

		/** 港澳通行证 */
		String HK_MO_PASSPORT = "^[HMhm]{1}([0-9]{10}|[0-9]{8})$";

		/** 台湾通行证 */
		String TAIWAN_PASSPORT = "(^[0-9]{8}$)|(^[0-9]{10}$)";

		/** (年-月-日)格式日期 */
		String DATE_FORMAT = "([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})-(((0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)-(0[1-9]|[12][0-9]|30))|(02-(0[1-9]|[1][0-9]|2[0-8])))";

		/** 正整数 */
		String POSITIVE_INTEGER = "^[1-9]\\d*$";

		/** 负整数 */
		String NEGTIVE_INTEGER = "^-[1-9]\\d*$";

		/** 整数 */
		String INTEGER = "^-?[1-9]\\d*$";

		/** 非负整数（正整数 + 0） */
		String NON_NEGATIVE_INTEGER = "^[1-9]\\d*|0$";

		/** 非正整数（负整数 + 0） */
		String NON_POSITIVE_INTEGER = "^-[1-9]\\d*|0$";

		/** 正浮点数 */
		String POSITIVE_FLOAT = "^[1-9]\\d*\\.\\d*|0\\.\\d*[1-9]\\d*$";

		/** 负浮点数 */
		String NEGATIVE_FLOAT = "-[1-9]\\d*\\.\\d*|-0\\.\\d*[1-9]\\d*$";

		/** 金额格式 */
		String MONEY_FORMAT = "^(([1-9]{1}\\d*)|([0]{1}))(\\.(\\d){0,2})?$";

		/** 用户名(中文、英文、数字或下划线，6-20个字) */
		String USER_NAME = "^[\\u4E00-\\u9FA5\\uF900-\\uFA2D\\w]{6,20}$";

		/** 用户昵称(中文、英文、数字或下划线，2-15个字) */
		String USER_NICK = "^[\\u4E00-\\u9FA5\\uF900-\\uFA2D\\w]{2,15}$";

		/** 中文名(2-20个字) */
		String CHINESE_NAME = "^[\\u4E00-\\u9FA5\\uF900-\\uFA2D\\]{2,20}$";

		/** 英文名(2-50个字) */
		String ENGLISH_NAME = "^[A-Za-z\\s]{2,50}$";

	}

}
