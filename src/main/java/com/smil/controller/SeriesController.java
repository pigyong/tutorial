package com.smil.controller;

import com.smil.dao.Menus;
import com.smil.service.SeriesService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


@Api(value = "SeriesController", description = "菜鸟首页内容")
@RestController
@RequestMapping("/series")
public class SeriesController {

    @Autowired
    SeriesService seriesService;

    @GetMapping("/queryMenuBySeries")
    @ApiOperation("分组查询对应的学习内容")
    public Map<String, List<Menus>> queryMenuBySeries() {
        return seriesService.queryMenuBySeries();
    }

    @GetMapping("/querySeries")
    @ApiOperation("查询所有系列")
    public List<String> querySeries() {
        return seriesService.querySeries();
    }
}
