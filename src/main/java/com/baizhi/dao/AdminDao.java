package com.my.dao;

import com.my.entity.Admin;

import java.util.List;

/**
 * @author:ljn
 * @Description:
 * @Date:2020/12/01 19:02
 */
public interface AdminDao {

    void queryAll(String name);

    List<Admin> selectAll(String id);

}
