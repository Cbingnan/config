package com.tedu.sp01.service;

import com.tedu.sp01.pojo.Order;
/**
 *订单业务层接口
 */
public interface OrderService {

	/**
	 * 根据订单id获取订单数据
	 * @param orderId 订单id
	 * @return 匹配的订单数据
	 */
	Order getOrder(String orderId);
	
	/**
	 * 添加订单
	 * @param order 订单数据
	 */
	void addOrder(Order order);
	
}
