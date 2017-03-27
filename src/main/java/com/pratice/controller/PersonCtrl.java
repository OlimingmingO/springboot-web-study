package com.pratice.controller;

import com.pratice.bean.Person;
import com.pratice.service.PersonService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by Oliverlee on 2017/3/25.
 */

@RestController
@RequestMapping("/Person")
public class PersonCtrl {
    @Resource
    PersonService personService;

    @RequestMapping("/save")
    public String save(){
        Person person = new Person();
        person.setPerName("zhangsan");
        person.setRemarks("chuzi");
        person.setPerAge(18);
        person.setPerCreatetime( new Date());
        personService.Save(person);
        return "Save is called";
    }
    @RequestMapping("/delete")
    public void delete(){
        personService.Delete(1);
    }
    @RequestMapping("/getAll")
    public Iterable<Person> getAll(){
        return personService.GetAll();
    }

    @RequestMapping("/findByPerName")
    public Person findByPerName(String personName){
        return personService.findByperName(personName);
    }

    @RequestMapping("/findMyPersonName")
    public Person findMyPersonName(String personName){
        return personService.findMyPersonName(personName);
    }
}
