package com.tutorial.infrastructure.dao;

import com.tutorial.domain.entity.Menus;
import com.tutorial.domain.valueobject.MenusName;
import com.tutorial.domain.valueobject.Series;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "menus")
@Data
public class MenusDao {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    private String name;

    private String url;

    private String icon;

    private String description;

    private String series;

    public static Menus toMenus(MenusDao menusDao) {
        return Menus.builder()
                .name(new MenusName(menusDao.getName()))
                .url(menusDao.getUrl())
                .icon(menusDao.icon)
                .desciption(menusDao.getDescription())
                .series(new Series(menusDao.getSeries()))
                .build();
    }
}