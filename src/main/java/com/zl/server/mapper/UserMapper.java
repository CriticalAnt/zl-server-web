package com.zl.server.mapper;

import com.zl.server.bean.User;

/**
 * @Author: wtao
 * @Date: 2018/12/17 20:41
 * @Version 1.0
 */

public interface UserMapper {

    User findUser(String userName);
}
