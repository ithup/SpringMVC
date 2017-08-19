package com.ithup.service;

import java.util.List;

import com.ithup.pojo.Items;

/**
 * 商品服务层功能
 * @author acer
 *
 */
public interface ItemsService {
	
	/**
	 * 查询商品信息
	 * @return
	 * @throws Exception
	 */
	public List<Items> findItems() throws Exception;
}
