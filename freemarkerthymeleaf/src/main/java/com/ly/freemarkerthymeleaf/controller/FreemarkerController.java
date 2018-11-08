package com.ly.freemarkerthymeleaf.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/ftl")
public class FreemarkerController {

    @RequestMapping("/helloFtl")
    public String hello(Map<String,Object> map){
       // map.addAttribute("message","hello! freemarker");
        map.put("name","xiaoming");
        // helloFtl 不要加上斜杠，/ helloFtl   加上斜杠会导致 linux 上无法显示
        return "helloFtl";

    }

}
