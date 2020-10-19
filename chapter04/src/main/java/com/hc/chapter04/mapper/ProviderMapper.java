package com.hc.chapter04.mapper;

import com.hc.chapter04.pojo.Account;
import com.hc.chapter04.pojo.Provider;

import java.util.List;
import java.util.Map;

public interface ProviderMapper {
    /**
     * 用于查询供应商
     * @return
     */
    public List<Provider> getpro();

    /**
     * 模糊查询供应商列表列表
     * @param map
     * @return
     */
    public List<Provider> getprolist(Map<String,Object> map);

    /**
     * 添加供应商
     * @param pro
     * @return
     */
    public Integer Addpro(Provider pro);

    /**
     * 根据aId查询详情
     * @param pId
     * @return
     */
    public Provider getProinfo(Integer pId);

    /**
     * 根据id修改
     * @param pro
     * @return
     */
    public Integer updatePro(Provider pro);

    /**
     * 根据id删除
     * @param pId
     * @return
     */
    public Integer Prodel(Integer pId);
}