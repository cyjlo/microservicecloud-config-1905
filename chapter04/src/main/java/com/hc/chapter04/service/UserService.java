package com.hc.chapter04.service;

import com.hc.chapter04.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    /**
     * 根据用户名密码登录
     * @param user
     * @return
     */
    public User login(User user);

    /**
     * 查询全部用户
     * @param map
     * @return
     */
    public List<User> getUserlist(Map<String,Object> map);

    /**
     * 用户添加
     * @param user
     * @return
     */
    public Integer Add(User user);

    /**
     * 根据id查询用户详情
     * @param uId
     * @return
     */
    public User getinfo(Integer uId);

    /**
     * 根据id修改用户信息
     * @param user
     * @return
     */
    public Integer updateuser(User user);
    /**
     * 修改密码
     * @param user
     * @return
     */
    public Integer updatepwd(User user);
    /**
     * 根据id删除
     * @param uId
     * @return
     */
    public Integer del(Integer uId);


}
