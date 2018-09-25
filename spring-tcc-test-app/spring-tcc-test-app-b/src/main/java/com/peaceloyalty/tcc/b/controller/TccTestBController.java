package com.peaceloyalty.tcc.b.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "ttb/")
public class TccTestBController {


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
