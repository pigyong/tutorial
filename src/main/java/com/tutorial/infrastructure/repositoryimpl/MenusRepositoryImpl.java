package com.tutorial.infrastructure.repositoryimpl;

import com.tutorial.domain.entity.Menus;
import com.tutorial.domain.repository.MenusRepository;
import com.tutorial.domain.valueobject.MenusName;
import com.tutorial.infrastructure.dao.MenusDao;
import com.tutorial.infrastructure.mapper.MenusMapper;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MenusRepositoryImpl implements MenusRepository {
    @Resource
    MenusMapper menusMapper;

    @Override
    public MenusName nextIdentity() {
        return null;
    }

    @Override
    public Optional<Menus> find(MenusName menusName) {
        Example example = new Example(MenusDao.class);
        example.createCriteria().andEqualTo("name", menusName.getName());
        return Optional.ofNullable(menusMapper.selectOneByExample(example)).map(MenusDao::toMenus);
    }

    @Override
    public Collection<Menus> findAll() {
        return menusMapper.selectAll().stream().map(MenusDao::toMenus).collect(Collectors.toList());
    }

    @Override
    public void save(Menus entity) {
        menusMapper.saveOrUpdate(entity);
    }

    @Override
    public void saveAll(Collection<Menus> entityCollection) {

    }

    @Override
    public void remove(Menus entity) {
        Example example = new Example(MenusDao.class);
        example.createCriteria().andEqualTo("name", entity.getName().getName());
        menusMapper.deleteByExample(entity);
    }

    @Override
    public void removeAll(Collection<Menus> entityCollection) {

    }
}
