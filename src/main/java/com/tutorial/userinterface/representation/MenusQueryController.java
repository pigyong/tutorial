package com.tutorial.userinterface.representation;

import com.tutorial.infrastructure.mapper.MenusMapper;
import com.tutorial.userinterface.vo.MenusVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Api(value = "MenusQueryController", description = "菜鸟首页查询内容")
@RestController
@RequestMapping("/menusQuery")
public class MenusQueryController {

    MenusMapper menusMapper;

    @Autowired
    public MenusQueryController(MenusMapper menusMapper) {
        this.menusMapper = menusMapper;
    }

    @GetMapping("/queryMenusBySeries")
    @ApiOperation("分组查询对应的学习内容")
    public Map<String, List<MenusVO>> queryMenuBySeries() {
        return menusMapper.queryMenuBySeries().stream().collect(Collectors.groupingBy(MenusVO::getSeries));
    }

    @GetMapping("/querySeries")
    @ApiOperation("查询所有系列")
    public List<String> querySeries() {
        return menusMapper.queryMenuBySeries().stream().map(MenusVO::getSeries).distinct().collect(Collectors.toList());
    }
}
