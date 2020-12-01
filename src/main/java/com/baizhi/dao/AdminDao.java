package com.baizhi.dao;

import com.baizhi.entity.Admin;

import java.util.List;

/**
 * @author:ljn
 * @Description:
 * @Date:2020/12/01 19:02
 */
public interface AdminDao {

    List<Admin> selectAll();
    void queryAll(String id);

}
