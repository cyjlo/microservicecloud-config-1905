package com.hc.chapter04.mapper;

import com.hc.chapter04.pojo.Account;

import java.util.List;
import java.util.Map;

public interface AccountMapper {
    /**
     * 模糊查询商品列表
     * @param map
     * @return
     */
    public List<Account> getAcc(Map<String,Object> map);

    /**
     * 添加账单
     * @param acc
     * @return
     */
    public Integer Addacc(Account acc);

    /**
     * 根据aId查询详情
     * @param aId
     * @return
     */
    public Account getAccinfo(Integer aId);

    /**
     * 根据id修改
     * @param acc
     * @return
     */
    public Integer updateAcc(Account acc);
    /**
     * 根据id删除
     * @param aId
     * @return
     */
    public Integer Accdel(Integer aId);



}