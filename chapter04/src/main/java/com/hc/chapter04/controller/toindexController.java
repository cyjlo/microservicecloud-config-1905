package com.hc.chapter04.controller;

import com.hc.chapter04.pojo.Provider;
import com.hc.chapter04.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("toindex")
public class toindexController {
    @Autowired
    ProviderService proservice;

    @RequestMapping("/login")
    public String tologin(){
        return "login";
    }

    @RequestMapping("/index")
    public String toindex(){
        System.out.println("进入首页");
        return "admin_index";
    }


    @RequestMapping("/top")
    public String top(){
        return "admin_top";
    }

    @RequestMapping("/left")
    public String left(){
        return "admin_left";
    }



    @RequestMapping("/providerAdmin")
    public String providerAdmin(){
        return "providerAdmin";
    }

    @RequestMapping("/to_userAdmin")
    public String userAdmin(){
        System.out.println("进入用户列表....");
        return "userAdmin";
    }

    //跳转用户添加页面
    @RequestMapping("/to_userAdd")
    public String userAdd(){
        System.out.println("进入用户添加页面....");
        return "userAdd";
    }

    //跳转用户详情页面
    @RequestMapping("/to_userxq")
    public String to_userxq(){
        System.out.println("进入用户详情页面....");
        return "userxq";
    }

    //跳转修改密码页面
    @RequestMapping("/to_upwd")
    public String to_upwd(){
        System.out.println("进入修改密码页面....");
        return "upwd";
    }

    /*=====================账单相关========================*/
    @RequestMapping("/list")
    public String list(){
        System.out.println("进入账单表....");
        return "admin_bill_list";
    }

    @RequestMapping("/to_modify")
    public String to_modify(Model model){
        List<Provider> pro = proservice.getpro();
        model.addAttribute("pro",pro);
        System.out.println("进入账添加....");
        return "modify";
    }

    @RequestMapping("/to_accinfo")
    public String to_accinfo(Model model){
        List<Provider> pro = proservice.getpro();
        model.addAttribute("pro",pro);
        System.out.println("进入账单详情....");
        return "accinfo";
    }

    /*=====================账单相关========================*/
    @RequestMapping("/to_prolist")
    public String to_prolist(){
        System.out.println("进入供应商列表....");
        return "providerAdmin";
    }

    @RequestMapping("/to_Addpro")
    public String to_Addpro(){
        System.out.println("进入供应添加商列表....");
        return "providerAdd";
    }

    @RequestMapping("/to_proinfo")
    public String to_proinfo(){
        System.out.println("进入供应商详情....");
        return "providerupdate";
    }

    @RequestMapping("/to_login")
    public String to_login(){
        return "login";
    }

}
