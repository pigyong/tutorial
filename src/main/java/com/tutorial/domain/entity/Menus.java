package com.tutorial.domain.entity;

import com.tutorial.domain.valueobject.MenusName;
import com.tutorial.domain.valueobject.Series;
import com.tutorial.framework.DomainEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Menus implements DomainEntity<MenusName> {

    private MenusName name;

    private String url;

    private String icon;

    private String desciption;

    private Series series;

    @Override
    public MenusName identity() {
        return name;
    }
}
