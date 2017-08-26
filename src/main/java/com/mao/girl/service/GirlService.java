package com.mao.girl.service;

import com.mao.girl.entity.Girl;
import com.mao.girl.repository.GirlRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
