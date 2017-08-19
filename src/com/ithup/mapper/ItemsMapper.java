package com.ithup.mapper;

import java.util.List;

import com.ithup.pojo.Items;


public interface ItemsMapper {
  
    public List<Items> selectItemsList();

    public Items selectByPrimaryKey(Integer id);

    int updateByPrimaryKeyWithBLOBs(Items record);
}