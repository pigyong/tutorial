package com.tutorial.userinterface.restful;

import com.tutorial.applicationservice.MenusApplicationService;
import com.tutorial.userinterface.vd.MenusSaveVD;
import com.tutorial.userinterface.vd.MenusDeleteVD;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Api(value = "MenusController", description = "菜鸟首页菜单内容")
@RestController
@RequestMapping("/menus")
public class MenusController {

    @Autowired
    MenusApplicationService menusAPplicationService;

    @PostMapping("/update")
    @ApiOperation("更新学习内容")
    public void insert(@RequestBody @Valid MenusSaveVD menusSaveVD) {
        menusAPplicationService.save(menusSaveVD, Boolean.TRUE);
    }

    @PostMapping("/insert")
    @ApiOperation("添加学习内容")
    public void update(@RequestBody @Valid MenusSaveVD menusSaveVD) {
        menusAPplicationService.save(menusSaveVD, Boolean.FALSE);
    }

    @PostMapping("/delete")
    @ApiOperation("删除学习内容")
    public void delete(@RequestBody @Valid MenusDeleteVD menusDeleteVD) {
        menusAPplicationService.delete(menusDeleteVD);
    }
}
