package com.ithup.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ithup.pojo.Items;
import com.ithup.service.ItemsService;

/**
 * ��Ʒ���Ʋ����
 * 
 * @author acer
 *
 */
@Controller
public class ItemsController {
	@Autowired
	private ItemsService itemsService;
	
	// ָ��URL�����󷽷���ӳ��
	// URL����һ����ַ���ҵ��������������:localhost:8081/SpringMVC/itemsList.action
	@RequestMapping("/itemsList")
	public ModelAndView itemsList() throws Exception {
		List<Items> itemList = itemsService.findItems();
		//����modelandview����
		ModelAndView modelAndView = new ModelAndView();
		//���model
		modelAndView.addObject("itemList", itemList);
		//�����ͼ
		modelAndView.setViewName("itemList");
		//����ModelAndView����
		return modelAndView;
	}
}
