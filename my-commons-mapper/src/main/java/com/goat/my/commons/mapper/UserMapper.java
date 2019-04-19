package com.goat.my.commons.mapper;




import com.goat.my.commons.domain.User;
import com.goat.my.commons.domain.UserWithRole;
import tk.mybatis.mapper.MyMapper;

import java.util.List;

public interface UserMapper extends MyMapper<User> {

	List<User> findUserWithDept(User user);

	List<User> selectAll();

	List<UserWithRole> findUserWithRole(Long userId);
	
	User findUserProfile(User user);
}