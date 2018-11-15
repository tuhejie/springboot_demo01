package com.tuhj.springboot;

import com.tuhj.entities.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author ：Created by tuhj
 * @Date ：Created in 2018-11-15 17:34
 * @Description ：
 * @Modified ：
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloWordSpringBootMainTest {

    @Autowired
    Person person;

    @Test
    public void contextLoads(){
        System.out.println(person.toString());
    }
}
