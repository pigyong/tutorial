package com.tutorial.framework;

import java.util.Collection;
import java.util.Optional;

/**
 * 领域仓库
 * - 必须针对聚合
 * - 必须有相应的主键
 *
 * @param <DE> DomainEntity类型
 * @param <IdentityType> 主键类型
 */
public interface DomainRepository<DE extends DomainEntity<IdentityType>, IdentityType> {

    /**
     * 返回下一个实体主键对象
     * @return IdentityType
     */
    IdentityType nextIdentity();

    /**
     * 根据实体主键 查找一个实体
     * @param identityType IdentityType
     * @return DE
     */
    Optional<DE> find(IdentityType identityType);

    Collection<DE> findAll();

    void save(DE entity);
    void saveAll(Collection<DE> entityCollection);
    void remove(DE entity);
    void removeAll(Collection<DE> entityCollection);
}
