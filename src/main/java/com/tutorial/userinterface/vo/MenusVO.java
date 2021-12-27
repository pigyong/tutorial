package com.tutorial.userinterface.vo;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@ApiModel("菜单页面视图")
@Data
public class MenusVO {
    String name;

    String url;

    String icon;

    String description;

    String series;
}
