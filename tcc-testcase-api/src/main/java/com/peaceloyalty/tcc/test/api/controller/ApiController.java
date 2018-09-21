package com.peaceloyalty.tcc.test.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @RequestMapping("/test")
    public String test(@RequestParam(value = "name", defaultValue = "api") String api) {
        return api + " app ok";
    }
}
