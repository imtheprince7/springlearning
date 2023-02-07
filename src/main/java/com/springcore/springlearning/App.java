package com.springcore.springlearning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Spring Learning" );
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student stu = (Student) context.getBean("student1");
        System.out.println(stu);
    }
}
