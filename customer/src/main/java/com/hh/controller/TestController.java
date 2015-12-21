package com.hh.controller;

import com.hh.service.InterfaceTest;
import com.hh.service.ProducterDemo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 15-12-21.
 */
@Controller
@RequestMapping("/")
public class TestController {

    @Resource(name = "producterDemo")//name的名字要和ProducterDemo定义的名字一样
    private ProducterDemo producterDemo;
    @Resource(name = "groupTestOne")
    private InterfaceTest InterfaceTestOne;
    @Resource(name = "groupTestTwo")
    private InterfaceTest InterfaceTestTwo;
    @RequestMapping("testOne")
    public void testOne(HttpServletRequest request){
        System.out.println("------:"+producterDemo.saySomeThing("hahahha"));
        System.out.println("------:"+InterfaceTestOne.say("hehheeheh"));
        System.out.println("------:"+InterfaceTestTwo.say("hehheeheh"));
        System.out.println("----------------");
    }
}
