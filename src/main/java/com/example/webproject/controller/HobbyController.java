package com.example.webproject.controller;

import com.example.webproject.entity.Hobby;
import com.example.webproject.service.HobbyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.persistence.GeneratedValue;

@Controller
@RequestMapping("/hobby")
public class HobbyController {//用户爱好控制
    @Autowired
    private HobbyService hobbyService;

    @GetMapping("/search")
    public ModelAndView testSearch(){
        return new ModelAndView("searchhobby");
    }

    @GetMapping("/searchcheck")
    public ModelAndView testSearchCheck(String name){
        Hobby hobby=hobbyService.selectByName(name);
        if(hobby==null){
            return new ModelAndView("searchhobby");
        }
        return new ModelAndView("result");
    }

}
