package com.mao.girl;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import javax.transaction.Transactional;

public interface GirlRepository extends JpaRepository<Girl,Integer>{
    //通过年龄来查询
    List<Girl> findByAge(int age);

    @Transactional
    void deleteByAge(int age);
}
