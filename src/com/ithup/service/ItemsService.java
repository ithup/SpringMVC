package com.ithup.service;

import java.util.List;

import com.ithup.pojo.Items;

/**
 * ��Ʒ����㹦��
 * @author acer
 *
 */
public interface ItemsService {
	
	/**
	 * ��ѯ��Ʒ��Ϣ
	 * @return
	 * @throws Exception
	 */
	public List<Items> findItems() throws Exception;
}
