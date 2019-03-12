package com.userfront.dao;

import com.userfront.domain.security.Role;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by rajib.rath
 */
public interface RoleDao extends CrudRepository<Role, Integer> {
    Role findByName(String name);
}
