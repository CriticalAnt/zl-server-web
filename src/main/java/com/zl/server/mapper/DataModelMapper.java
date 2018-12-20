package com.zl.server.mapper;

import com.zl.server.bean.DataModel;

import java.util.List;

/**
 * @Author: wtao
 * @Date: 2018-12-20 20:07
 * @Version 1.0
 */
public interface DataModelMapper {

    boolean insert(DataModel dataModel);

    List<DataModel> findAll();
}
