package com.tutorial.applicationservice;

import com.tutorial.applicationservice.directive.command.MenusDeletedCommand;
import com.tutorial.applicationservice.directive.command.MenusSaveCommand;
import com.tutorial.domain.entity.Menus;
import com.tutorial.domain.repository.MenusRepository;
import com.tutorial.domain.valueobject.MenusName;
import com.tutorial.domain.valueobject.Series;
import com.tutorial.userinterface.vd.MenusDeleteVD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MenusApplicationService {
    MenusRepository menusRepository;

    @Autowired
    public MenusApplicationService(MenusRepository menusRepository) {
        this.menusRepository = menusRepository;
    }


    public void save(MenusSaveCommand menusCommandVD, Boolean isSave) {
        String name = menusCommandVD.name();
        String icon = menusCommandVD.icon();
        String description = menusCommandVD.description();
        String series = menusCommandVD.series();
        String url = menusCommandVD.url();
        Optional<Menus> optional = menusRepository.find(new MenusName(name));

        if (isSave && optional.isPresent()) {
            throw new RuntimeException("The menus already not exists.");
        }
        if (!isSave && !optional.isPresent()) {
            throw new RuntimeException("The menus does not exists.");
        }

        Menus menus = Menus.builder()
                .name(new MenusName(name)).desciption(description).icon(icon).url(url).series(new Series(series)).build();

        menusRepository.save(menus);
    }

    public void delete(MenusDeletedCommand menusDeleteVD) {
        String name = menusDeleteVD.name();
        Optional<Menus> optional = menusRepository.find(new MenusName(name));

        if (!optional.isPresent()) {
            throw new RuntimeException("The menus does not exists.");
        }

        menusRepository.remove(optional.get());
    }
}
