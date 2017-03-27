package com.pratice.service;

import com.pratice.bean.Person;
import com.pratice.repository.Person2Repository;
import com.pratice.repository.PersonRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by Oliverlee on 2017/3/25.
 */
@Service
public class PersonService {
    /*
    * Save和Delete需要事物绑定
    *
    * */
    @Resource
    PersonRepository personRepository;

    @Resource
    Person2Repository person2Repository;

    @Transactional
    public void Save(Person person){
        personRepository.save(person);
    }
    public void Delete(int id){
        personRepository.delete(id);
    }
    public Iterable<Person> GetAll(){
        return personRepository.findAll();
    }

    public Person findByperName(String personName){
        return person2Repository.findByperName(personName);
    }

    public Person findMyPersonName(String personName){
        return person2Repository.findMyPersonName(personName);
    }


}
