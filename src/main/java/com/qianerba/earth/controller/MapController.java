package com.qianerba.earth.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author qianerba
 * @create 2021/4/25
 * @describe desc your class
 */
@Slf4j
@Controller
@RequestMapping(value = "/v1/map")
public class MapController {

    @GetMapping("/display")
    public String display(HttpServletRequest request, Model model) {
        model.addAttribute("name", "哈哈");
        return "display";
    }
}
