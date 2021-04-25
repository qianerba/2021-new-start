package com.qianerba.earth.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

/**
 * @author qianerba
 * @create 2021/4/25
 * @describe desc your class
 */
@Slf4j
@RestController
@RequestMapping(value = "/v1/debug")
public class DebugController {

    @GetMapping(value = "/alive", produces = MediaType.TEXT_PLAIN_VALUE)
    public String helloGuys(HttpServletRequest request) {
        log.info("test log info");
        return "Hi guys, system alive until " + LocalDateTime.now();
    }
}
