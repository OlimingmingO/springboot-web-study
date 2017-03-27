package com.pratice.repository;

import com.pratice.bean.Person;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Oliverlee on 2017/3/25.
 */


public interface PersonRepository extends CrudRepository<Person, Integer>{

}
