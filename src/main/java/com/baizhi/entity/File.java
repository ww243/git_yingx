package com.my.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author:ljn
 * @Description:
 * @Date:2020/12/01 18:47
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class File implements Serializable {

    private String id;
    private String name;
    private String img;

}
