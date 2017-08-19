package com.ithup.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ithup.pojo.Items;
import com.ithup.service.ItemsService;

/**
 * 商品控制层介绍
 * 
 * @author acer
 *
 */
@Controller
public class ItemsController {
	@Autowired
	private ItemsService itemsService;
	
	// 指定URL到请求方法的映射
	// URL输入一个地址，找到这个方法：列如:localhost:8081/SpringMVC/itemsList.action
	@RequestMapping("/itemsList")
	public ModelAndView itemsList() throws Exception {
		List<Items> itemList = itemsService.findItems();
		//创建modelandview对象
		ModelAndView modelAndView = new ModelAndView();
		//添加model
		modelAndView.addObject("itemList", itemList);
		//添加视图
		modelAndView.setViewName("itemList");
		//返回ModelAndView对象
		return modelAndView;
	}
}
