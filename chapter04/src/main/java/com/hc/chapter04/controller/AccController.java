package com.hc.chapter04.controller;

import com.hc.chapter04.pojo.Account;
import com.hc.chapter04.pojo.Provider;
import com.hc.chapter04.pojo.User;
import com.hc.chapter04.service.AccService;
import com.hc.chapter04.service.ProviderService;
import com.hc.chapter04.util.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/Acc")
public class AccController {

    @Autowired
    AccService accservice;
    @Autowired
    ProviderService proservice;

    @RequestMapping("/getAcc")
    public String getAcc(String gName, Integer ispay, Model model){
        Map<String,Object> map = new HashMap<String, Object>();

        if(gName!=null&&!"".equals(gName)){
            map.put("gName",gName);
        }
        if(ispay!=null){
            map.put("ispay",ispay);
        }
        List<Account> acclist = accservice.getAcc(map);
        model.addAttribute("acclist",acclist);


        //保证页面查询后的值还在
        model.addAttribute("gName",gName);
        model.addAttribute("ispay",ispay);
        return "forward:/toindex/list";


    }

    @RequestMapping("/Addacc")
    public String Addacc(Account acc,Model model){
        Integer rs = accservice.Addacc(acc);
        if(rs>0){
            return "forward:getAcc";
        }else{
            return "redirect:/toindex/to_modify";
        }

    }

    @RequestMapping("/getAccinfo")
    public String getAccinfo(Integer aId,Model model){
        Account acc = accservice.getAccinfo(aId);
        model.addAttribute("acc",acc);
        return "forward:/toindex/to_accinfo";
    }

    @RequestMapping("/Accupdate")
    public String Accupdate(Account acc){
        Integer rs = accservice.updateAcc(acc);
        if(rs>0){
            return "forward:getAcc";
        }else{
            return "redirect:/toindex/to_accinfo";
        }
    }

    //删除
    @RequestMapping(value = "/Accdel", method = RequestMethod.POST)
    @ResponseBody
    public ApiResponse Accdel(Integer aId) {
        ApiResponse request = new ApiResponse();
        Integer rs = accservice.Accdel(aId);
        if (rs == null) {
            request.setCode(0);
        } else {
            request.setCode(1);
        }
        return request;
    }
}
