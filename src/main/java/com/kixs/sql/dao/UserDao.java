package com.kixs.sql.dao;

import com.kixs.sql.module.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author wangbing
 * @version 1.0, 2018/11/9
 */
@Repository
public interface UserDao {

    void insertBatch(@Param("users") List<User> users);
}
