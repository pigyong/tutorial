package com.smil.service.impl;

import com.smil.dao.Menus;
import com.smil.mapper.MenusMapper;
import com.smil.service.SeriesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class SeriesServiceImpl implements SeriesService {

    @Resource
    MenusMapper menusMapper;

    @Override
    public List<String> querySeries() {
        return menusMapper.selectAll().stream().map(Menus::getSeries).distinct().collect(Collectors.toList());
    }

    @Override
    public Map<String, List<Menus>> queryMenuBySeries() {
        return menusMapper.selectAll().stream().collect(Collectors.groupingBy(Menus::getSeries));
    }
}
