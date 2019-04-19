package com.goat.my.service.user.provider.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageInfo;
import com.goat.my.commons.domain.User;
import com.goat.my.commons.mapper.UserMapper;
import com.goat.my.service.user.api.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(version = "${services.versions.user.v1}")
@Transactional(readOnly = true)
public class TbUserServiceImpl implements TbUserService {

    @Autowired
    private UserMapper userMapper;

    // doit  报错： org.apache.ibatis.binding.BindingException: Invalid bound statement (not found): com.goat.my.commons.mapper.UserMapper.selectAll
    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    /**
     * 查询分页数据
     *
     * @param pageNum  页码
     * @param pageSize 笔数
     * @param tbUser   查询参数
     * @return
     */
    @Override
    public PageInfo<User> page(int pageNum, int pageSize, User tbUser) {
        return null;
    }

    //    @Override
//    public PageInfo<TbUser> page(int pageNum, int pageSize, TbUser tbUser) {
//        String username = tbUser.getUsername();
//        String phone = tbUser.getPhone();
//        String email = tbUser.getEmail();
//
//        Example example = new Example(TbUser.class);
//        example.createCriteria()
//                .andLike("username", username != null ? username + "%" : null)
//                .andLike("phone", phone != null ? phone + "%" : null)
//                .andLike("email", email != null ? email + "%" : null);
//
//        PageHelper.offsetPage(pageNum, pageSize);
//        PageInfo<TbUser> pageInfo = new PageInfo<>(tbUserMapper.selectByExample(example));
//        return pageInfo;
//    }
}
