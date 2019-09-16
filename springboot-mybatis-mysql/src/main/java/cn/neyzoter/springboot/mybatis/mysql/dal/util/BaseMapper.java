package cn.neyzoter.springboot.mybatis.mysql.dal.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Basemapper
 * @author Neyzoter Song
 * @date 2019/9/16
 * @param <T>
 */
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
