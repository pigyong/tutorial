package com.tutorial.userinterface.vd;

import com.tutorial.applicationservice.directive.command.MenusDeletedCommand;
import io.swagger.annotations.ApiModel;

import javax.validation.constraints.NotBlank;

@ApiModel("菜单删除视图")
public class MenusDeleteVD implements MenusDeletedCommand {

    @NotBlank(message = "菜单名称不能为空")
    String name;

    @Override
    public String name() {
        return name;
    }
}
