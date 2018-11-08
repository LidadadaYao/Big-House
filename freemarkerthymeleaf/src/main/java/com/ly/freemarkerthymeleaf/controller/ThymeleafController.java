package com.ly.freemarkerthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 注意：
 * 1、在 Thyeleaf 模板文件中，标签需要闭合，3.0 之前是需要闭合的
 * 2、Thymeleaf 3.0 之后是可以不强制要求闭合的
 *
 */
@Controller
@RequestMapping("th")
public class ThymeleafController {
        @RequestMapping("/hello")
        public String index(ModelMap map) {
            map.addAttribute("name", "佩佩猪");
            return "hello";
        }

}
