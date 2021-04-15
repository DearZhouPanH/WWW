package com.ssh.dao;

import com.ssh.entity.Person;

import java.util.List;

public interface TestDao {


    //定义查询所有数据方法接口
    List<Person> getPersons();

}
