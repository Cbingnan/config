package com.tedu.sp01.service;
import java.util.List;

import com.tedu.sp01.pojo.Item;
/**
 * 商品业务接口
 * @author 78268
 *
 */
public interface ItemService {
	
	/**
	 * 根据订单id获取商品列表
	 * @param orderId
	 * @return 匹配的商品信息
	 */
	List<Item> getItems(String orderId);

	/**
	 * 根据商品列表进行库存的减少
	 * @param list 商品列表
	 */
	void decreaseNumbers(List<Item> list);
}
