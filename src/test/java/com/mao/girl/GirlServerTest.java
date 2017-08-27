package com.mao.girl;

import com.mao.girl.entity.Girl;
import com.mao.girl.service.GirlService;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by MaoYiHan on 2017/8/27.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GirlServerTest {
    @Autowired
    private GirlService mGirlService;

    @Test
    public void findOneTest() {
        Girl girl = mGirlService.findOne(2);
        Assert.assertEquals(20, girl.getAge());
    }
}
