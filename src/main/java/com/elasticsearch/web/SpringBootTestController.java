package com.elasticsearch.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "demo")
public class SpringBootTestController {

    @RequestMapping(value = "/test")
    public String dataGrid() {
        return "success";
    }



}
