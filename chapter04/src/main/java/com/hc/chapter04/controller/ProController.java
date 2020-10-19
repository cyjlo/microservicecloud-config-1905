package com.hc.chapter04.controller;

import com.hc.chapter04.pojo.Account;
import com.hc.chapter04.pojo.Provider;
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
@RequestMapping("/Pro")
public class ProController {

    @Autowired
    ProviderService proservise;

    @RequestMapping("/getPro")
    public String getPro(Provider pro, Model model){
        Map<String,Object> map = new HashMap<String, Object>();

        if(pro.getpName()!=null&&!"".equals(pro.getpName())){
            map.put("pName",pro.getpName());
        }
        if(pro.getpInfo()!=null&&!"".equals(pro.getpInfo())){
            map.put("pInfo",pro.getpInfo());
        }
        List<Provider> prolist = proservise.getprolist(map);
        model.addAttribute("prolist",prolist);


        //保证页面查询后的值还在
        model.addAttribute("pName",pro.getpName());
        model.addAttribute("pInfo",pro.getpInfo());
        return "forward:/toindex/to_prolist";


    }

    @RequestMapping("/Addpro")
    public String Addpro(Provider pro,Model model){
        Integer rs = proservise.Addpro(pro);
        if(rs>0){
            return "forward:getPro";
        }else{
            return "redirect:/toindex/to_Addpro";
        }

    }

    @RequestMapping("/getProinfo")
    public String getProinfo(Integer pId,Model model){
        Provider pro = proservise.getProinfo(pId);
        model.addAttribute("pro",pro);
        return "forward:/toindex/to_proinfo";
    }

    @RequestMapping("/Proupdate")
    public String Proupdate(Provider pro){
        Integer rs = proservise.updatePro(pro);
        if(rs>0){
            return "forward:getPro";
        }else{
            return "redirect:/toindex/to_proinfo";
        }
    }

    //删除
    @RequestMapping(value = "/Prodel", method = RequestMethod.POST)
    @ResponseBody
    public ApiResponse Prodel(Integer pId) {
        ApiResponse request = new ApiResponse();
        Integer rs = proservise.Prodel(pId);
        if (rs == null) {
            request.setCode(0);
        } else {
            request.setCode(1);
        }
        return request;
    }



}
