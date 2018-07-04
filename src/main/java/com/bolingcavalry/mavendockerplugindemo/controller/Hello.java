package com.bolingcavalry.mavendockerplugindemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class Hello {

    @RequestMapping("/")
    public String sayHello(){
    	//淇敼杩斿洖鐨勫瓧绗︿覆鐨勫唴瀹�
        return "hahahh.123456. Hello jenkins, " + new Date();
    }
}
