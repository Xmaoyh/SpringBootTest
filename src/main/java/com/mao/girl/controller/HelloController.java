package com.mao.girl.controller;

import com.mao.girl.properties.GirlProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    //    @Value("${cupSize}")
//    private String cupSize;
//    @Value("${age}")
//    private int age;
//    @Value("${content}")
//    private String content;
    @Autowired
    private GirlProperties mGirlProperties;

//    @RequestMapping(value = "/say/{id}", method = RequestMethod.GET)
//    public String say(@PathVariable("id") int id) {
//        return mGirlProperties.getCupSize() + id;
//    }

//    @RequestMapping(value = "/say", method = RequestMethod.POST)
//    public String say(@RequestParam("id") int id) {
//        return mGirlProperties.getCupSize() + id;
//    }

    //@RequestMapping(value = "/say", method = RequestMethod.POST)
    @GetMapping("/say")
    public String say(@RequestParam(value = "id", required = false, defaultValue = "0") int id) {
        return mGirlProperties.getCupSize() + id;
    }
}
