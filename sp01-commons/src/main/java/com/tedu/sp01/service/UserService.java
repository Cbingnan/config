package com.tedu.sp01.service;

import com.tedu.sp01.pojo.User;
/**
 *用户业务层接口
 */
public interface UserService {
	/**
	 * 根据用户id获取用户信息
	 * @param id 用户id
	 * @return 匹配的用户数据
	 */
	User getUser(Integer id);
	
	/**
	 * 根据用户id添加用户积分
	 * @param id 用户id
	 * @param score 积分
	 */
	void addScore(Integer id, Integer score);
}
