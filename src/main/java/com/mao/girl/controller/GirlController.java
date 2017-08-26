package com.mao.girl.controller;

import com.mao.girl.entity.Girl;
import com.mao.girl.repository.GirlRepository;
import com.mao.girl.service.GirlService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import javax.validation.Valid;

@RestController
public class GirlController {
    @Autowired
    private GirlRepository mGirlRepository;
    @Autowired
    private GirlService mGirlService;

    /**
     * 查询所有女生列表
     *
     * @return
     */
    @GetMapping("/girls")
    public List<Girl> girlList() {
        return mGirlRepository.findAll();
    }

    /**
     * 增加一个女生
     *
     * @return
     */
    @PostMapping("/addGirl")
    public Girl addGirl(@RequestParam("age") int age, @RequestParam("cupSize") String cupSize) {
        Girl girl = new Girl();
        girl.setAge(age);
        girl.setCupSize(cupSize);
        return mGirlRepository.save(girl);
    }

    /**
     * 增加一个女生
     * 直接只用对象
     * @return
     */
    @PostMapping("/addGirls")
    public Girl addGirl(@Valid Girl girl, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            System.out.println(bindingResult.getFieldError().getDefaultMessage());
            return null;
        }
        girl.setAge(girl.getAge());
        girl.setCupSize(girl.getCupSize());
        return mGirlRepository.save(girl);
    }

    /**
     * 增加两个女生
     *
     * @return
     */
    @PostMapping("/addGirlTwo")
    public void addGirlTwo() {
        mGirlService.insertTwo();
    }

    /**
     * 通过年龄来查询
     *
     * @param age
     * @return
     */
    @GetMapping("findGirls")
    public List<Girl> findGirl(@RequestParam("age") int age) {
        return mGirlRepository.findByAge(age);
    }

    /**删除ById
     * @param id
     */
    @GetMapping("deleteGirl")
    public void deleteGirlById(@RequestParam("id") int id) {
        mGirlRepository.delete(id);
    }

    /**删除ByAge
     * @param age
     */
    @GetMapping("deleteGirlByAge")
    public void deleteGirlByAge(@RequestParam("age") int age) {
        mGirlRepository.deleteByAge(age);
    }
}
