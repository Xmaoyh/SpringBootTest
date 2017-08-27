package com.mao.girl.service;

import com.mao.girl.entity.Girl;
import com.mao.girl.enums.ResultCodeEnum;
import com.mao.girl.exception.GirlException;
import com.mao.girl.repository.GirlRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 操作数据库逻辑
 */
@Service
public class GirlService {
    @Autowired
    private GirlRepository mGirlRepository;

    public void insertTwo(){
        Girl girlA = new Girl();
        girlA.setAge(18);
        girlA.setCupSize("A");
        mGirlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setAge(11);
        girlB.setCupSize("A");
        mGirlRepository.save(girlB);
    }

    public void getAge(int id) throws Exception{
        Girl girl = mGirlRepository.findOne(id);
        if(girl.getAge() < 20){
            throw new GirlException(ResultCodeEnum.UNDER_20);
        }else{
            throw new GirlException(ResultCodeEnum.UPER_20);
        }
    }
}
