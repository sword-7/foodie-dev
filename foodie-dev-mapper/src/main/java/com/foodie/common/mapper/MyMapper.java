package com.foodie.common.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author : fjf
 * @interface
 * @date : 2020-12-14 23:36
 **/
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
