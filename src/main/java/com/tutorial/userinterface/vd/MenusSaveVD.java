package com.tutorial.userinterface.vd;

import com.tutorial.applicationservice.directive.command.MenusSaveCommand;
import io.swagger.annotations.ApiModel;

import javax.validation.constraints.NotBlank;

@ApiModel("菜单指令视图")
public class MenusSaveVD implements MenusSaveCommand {

    @NotBlank(message = "菜单名称不能为空")
    String name;

    String url;

    String icon;

    String description;

    String series;

    @Override
    public String name() {
        return name;
    }

    @Override
    public String url() {
        return url;
    }

    @Override
    public String icon() {
        return icon;
    }

    @Override
    public String description() {
        return description;
    }

    @Override
    public String series() {
        return series;
    }
}
