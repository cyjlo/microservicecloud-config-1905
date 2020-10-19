package com.hc.chapter04.service.impl;

import com.hc.chapter04.mapper.ProviderMapper;
import com.hc.chapter04.pojo.Provider;
import com.hc.chapter04.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ProviderServiceImpl implements ProviderService {

    @Autowired
    ProviderMapper promapper;

    @Override
    public List<Provider> getpro() {
        return promapper.getpro();
    }

    @Override
    public List<Provider> getprolist(Map<String, Object> map) {
        return promapper.getprolist(map);
    }

    @Override
    public Integer Addpro(Provider pro) {
        return promapper.Addpro(pro);
    }

    @Override
    public Provider getProinfo(Integer pId) {
        return promapper.getProinfo(pId);
    }

    @Override
    public Integer updatePro(Provider pro) {
        return promapper.updatePro(pro);
    }

    @Override
    public Integer Prodel(Integer pId) {
        return promapper.Prodel(pId);
    }
}
