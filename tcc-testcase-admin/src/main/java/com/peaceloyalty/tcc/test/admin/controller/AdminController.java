package com.peaceloyalty.tcc.test.admin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @RequestMapping("/test")
    public String test(@RequestParam(value = "name", defaultValue = "admin") String admin) {
        return admin + " app ok";
    }
}
