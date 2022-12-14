package com.ku.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author kxl
 * @date 2022年12月10日 - 上午 01:56:09
 */
@Controller
public class RouterController {
    @RequestMapping({"/","/index"})
    public String index(){
        return "/index";
    }

    @RequestMapping("tologin")
    public String tologin(){
        return "views/login";
    }
    @RequestMapping("/leavel1/{id}")
    public String leavel1(@PathVariable("id") int id){
        return "views/leavel1/"+id;
    }

}
