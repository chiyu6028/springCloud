package com.xiaolugoo.dao;

import com.xiaolugoo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by chinaD on 2017/12/18.
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
