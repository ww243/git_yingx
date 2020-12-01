package com.baizhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author:ljn
 * @Description:
 * @Date:2020/12/01 18:43
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin implements Serializable {

    private String id;
    private String username;
    private String password;
}
