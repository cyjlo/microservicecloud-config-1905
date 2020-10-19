package com.hc.chapter04.controller;

import com.hc.chapter04.pojo.User;
import com.hc.chapter04.service.UserService;
import com.hc.chapter04.util.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    //登录
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public ApiResponse login(User user, HttpSession session) {
        ApiResponse request = new ApiResponse();
        user = userService.login(user);

        if (user == null) {
            request.setCode(0);
        } else {
            session.setAttribute("user", user);
            request.setCode(1);
        }
      return request;
    }


    @RequestMapping("/getuserlist")
    public String getuserlist(String username, Model model){
        Map<String,Object> map = new HashMap<String, Object>();
        if(username!=null&&!"".equals(username)){
            map.put("username",username);
        }
        List<User> userlist = userService.getUserlist(map);
        model.addAttribute("userlist",userlist);

        //保证页面查询后的值还在
        model.addAttribute("username",username);
        return "forward:/toindex/to_userAdmin";
    }

    @RequestMapping("/userAdd")
    public String userAdd(User user, Model model){
        Integer rs = userService.Add(user);
        if(rs>0){
            return "forward:/user/getuserlist";
        }else{
            return "redirect:/toindex/to_userAdd";
        }
    }

    @RequestMapping("/getuserinfo")
    public String getuserinfo(Integer uId,Model model){
        User userinfo = userService.getinfo(uId);
        model.addAttribute("userinfo",userinfo);
            return "forward:/toindex/to_userxq";
        }

    @RequestMapping("/updateuser")
    public String updateuser(User user){
        Integer rs = userService.updateuser(user);
        if(rs>0){
            return "forward:/user/getuserlist";
        }else{
            return "redirect:/toindex/to_userxq";
        }
    }

    @RequestMapping("/updatpwd")
    public String updatpwd(User user){
        Integer rs = userService.updatepwd(user);
        if(rs>0){
            return "forward:/user/getuserlist";
        }else{
            return "redirect:/toindex/to_upwd";
        }
    }

    @RequestMapping("/getuserinfo2")
    public String getuserinfo2(Integer uId,Model model){
        User userinfo = userService.getinfo(uId);
        model.addAttribute("userinfo",userinfo);
        return "forward:/toindex/to_upwd";
    }

    //删除
    @RequestMapping(value = "/del", method = RequestMethod.POST)
    @ResponseBody
    public ApiResponse del(Integer uId) {
        ApiResponse request = new ApiResponse();
          Integer rs = userService.del(uId);
        if (rs == null) {
            request.setCode(0);
        } else {
            request.setCode(1);
        }
        return request;
    }

    //退出清除session
    @RequestMapping("/ex")
    public String ex(HttpSession session){
        session.invalidate();
        return "forward:/toindex/to_login";
    }


    }


