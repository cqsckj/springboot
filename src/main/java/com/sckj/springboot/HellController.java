package com.sckj.springboot;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellController {
    @RequestMapping(value="/hel",method = RequestMethod.GET)
    public String say(){
        return "这是我第一个用Integllije idea 创建的spring boot例子";
    }
}
