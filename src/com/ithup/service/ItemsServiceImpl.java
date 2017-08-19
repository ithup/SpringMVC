package com.ithup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ithup.mapper.ItemsMapper;
import com.ithup.pojo.Items;
/**
 * 商品功能实现类
 * @author acer
 *
 */
public class ItemsServiceImpl implements ItemsService{
	
	@Autowired
	private ItemsMapper itemsMapper;
	
	@Override
	public List<Items> findItems() throws Exception {
		//如果不需要任何查询条件,直接将example对象new出来即可
		return itemsMapper.selectItemsList();
	}
	
}
