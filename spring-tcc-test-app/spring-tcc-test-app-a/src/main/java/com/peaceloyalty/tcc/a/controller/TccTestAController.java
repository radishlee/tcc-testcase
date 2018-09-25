package com.peaceloyalty.tcc.a.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "tta/")
public class TccTestAController {


    @ResponseBody
    @RequestMapping(value = "test", method = {RequestMethod.GET }, produces = "application/json;charset=UTF-8")
    public String queryStupointDetail() {
        try {
            return "success";
        } catch (Exception e) {
            return "failure";
        }
    }
}
