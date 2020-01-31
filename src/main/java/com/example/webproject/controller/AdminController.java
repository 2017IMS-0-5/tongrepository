package com.example.webproject.controller;

import com.example.webproject.entity.Admin;
import com.example.webproject.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class AdminController {//管理员相关控制
    @Autowired
    private AdminService adminService;

    @GetMapping("/login")
        public ModelAndView testLogin(){
        return new ModelAndView("loginPage");
    }

    @GetMapping("/loginCheck")
    public ModelAndView testLoginCheck(String account,String password){
        Admin admin=adminService.loginCheck(account,password);
        if(admin==null){
            return new ModelAndView("loginPage");
        }
        return new ModelAndView("index");
    }

    @GetMapping("/loginCheck2")
    public String testLoginCheck2(Admin admin1){
        Admin admin=adminService.loginCheck(admin1.getAccount(),admin1.getPassword());
        if(admin==null){
            return "redirect:/admin/login";
        }
        return "redirect:/admin/index";
    }

    @GetMapping("/index")
    public ModelAndView index(){
        return new ModelAndView("index");
    }
}
