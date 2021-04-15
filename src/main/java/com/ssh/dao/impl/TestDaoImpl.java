package com.ssh.dao.impl;

import com.ssh.dao.TestDao;
import com.ssh.entity.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Repository
@Transactional
public class TestDaoImpl implements TestDao {


    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession() {
        return this.sessionFactory.openSession();//
        /**
         * return this.sessionFactory.getCurrentSession();
         *         使用getCurrentSession()方法创建session有报错500，原因是没有在hibernate的配置文件中加入配置，hibernate4需要使用如下配置；
         *         <propety name="Hibernate.current_session_context_class">org.springframework.orm.hibernate4.SpringSessionContext</propety>
         *         同时，getCurrentSession()和openSession()虽然同为通过SessionFactory构建Session对象，但是openSession是打开一个新的对象，每次获得的都不是同一个；
         *         CurrentSession是获取上下文已有的，如果没有就自己创建一个新的，【参考：https://blog.csdn.net/qq_19167629/article/details/90263663】
         */
    }


    //实现查询方法
    public List<Person> getPersons(){
        getSession().close();
        return this.getSession().createCriteria(Person.class).list();

    }
}
