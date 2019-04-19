package com.goat.my.service.user.api;

import com.goat.my.commons.domain.User;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface TbUserService {
    /**
     * 查询全部数据
     * @return
     */
    List<User> selectAll();

    /**
     * 查询分页数据
     * @param pageNum 页码
     * @param pageSize 笔数
     * @param tbUser 查询参数
     * @return
     */
    PageInfo<User> page(int pageNum, int pageSize, User tbUser);
}
