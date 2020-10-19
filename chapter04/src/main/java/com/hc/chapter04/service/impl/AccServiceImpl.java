package com.hc.chapter04.service.impl;

import com.hc.chapter04.mapper.AccountMapper;
import com.hc.chapter04.pojo.Account;
import com.hc.chapter04.service.AccService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AccServiceImpl implements AccService {

    @Autowired
    AccountMapper accmapper;

    @Override
    public List<Account> getAcc(Map<String, Object> map) {
        return accmapper.getAcc(map);
    }

    @Override
    public Integer Addacc(Account acc) {
        return accmapper.Addacc(acc);
    }

    @Override
    public Account getAccinfo(Integer aId) {
        return accmapper.getAccinfo(aId);
    }

    @Override
    public Integer updateAcc(Account acc) {
        return accmapper.updateAcc(acc);
    }

    @Override
    public Integer Accdel(Integer aId) {
        return accmapper.Accdel(aId);
    }


}
