package com.tutorial.infrastructure.mapper;

import com.tutorial.domain.entity.Menus;
import com.tutorial.infrastructure.dao.MenusDao;
import com.tutorial.userinterface.vo.MenusVO;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface MenusMapper extends Mapper<MenusDao> {

    List<MenusVO> queryMenuBySeries();

    void saveOrUpdate(Menus entity);
}