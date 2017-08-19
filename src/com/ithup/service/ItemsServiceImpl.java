package com.ithup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ithup.mapper.ItemsMapper;
import com.ithup.pojo.Items;
/**
 * ��Ʒ����ʵ����
 * @author acer
 *
 */
public class ItemsServiceImpl implements ItemsService{
	
	@Autowired
	private ItemsMapper itemsMapper;
	
	@Override
	public List<Items> findItems() throws Exception {
		//�������Ҫ�κβ�ѯ����,ֱ�ӽ�example����new��������
		return itemsMapper.selectItemsList();
	}
	
}
