package com.tyb1222.demo.service.impl;

import com.tyb1222.demo.thrift.DataException;
import com.tyb1222.demo.thrift.Person;
import com.tyb1222.demo.thrift.PersonService;
import org.apache.thrift.TException;
import org.springframework.stereotype.Service;

@Service
public class MyServerServiceImpl implements PersonService.Iface {

    @Override
    public Person getPersonByUsername(String username) throws DataException, TException {
        System.out.println(String.format("接收到userName is :%s", username));
        Person person = new Person();
        person.setAge(10);
        person.setUsername(username);
        return person;
    }
}
