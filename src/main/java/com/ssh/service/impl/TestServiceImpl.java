package com.ssh.service.impl;

import com.ssh.dao.TestDao;
import com.ssh.dao.impl.TestDaoImpl;
import com.ssh.entity.Person;
import com.ssh.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service

public class TestServiceImpl implements TestService {
    public String test() {
        return "test";
    }

    @Autowired

    public TestDao testDao;


    @Override
    public List<Person> getPersons() {
        return testDao.getPersons();
    }


}
