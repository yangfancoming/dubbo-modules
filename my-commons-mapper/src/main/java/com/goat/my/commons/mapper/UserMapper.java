package com.goat.my.commons.mapper;

import com.goat.my.commons.domain.User;
import plus.mybatis.mapper.MyMapper;

import java.util.List;

public interface UserMapper extends MyMapper<User> {

	List<User> selectAll();

}