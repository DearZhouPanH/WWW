package com.ssh.controller;

import com.ssh.service.TestService;
import com.ssh.service.impl.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class TestController {

    @Autowired
    private TestService testService;


    @RequestMapping(value = "test" ,method = RequestMethod.GET)
    public String test(){
        return "test";
    }

    @RequestMapping(value = "springtest" ,method = RequestMethod.GET)
    public String springtest(){
        return testService.test();
    }


    @RequestMapping("main")
    public String main(Map<String ,Object> map){
        map.put("personlist",testService.getPersons());
        return "main";
    }



}
