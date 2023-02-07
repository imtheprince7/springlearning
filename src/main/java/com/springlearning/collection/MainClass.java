package com.springlearning.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		 ApplicationContext context =new ClassPathXmlApplicationContext("com/springlearning/collection/CollectionConfig.xml");
		 CollectionPractice cp = (CollectionPractice) context.getBean("coll");
		 
		 System.out.println(cp.getName());
		 System.out.println(cp.getPhone());
		 System.out.println(cp.getAddresses());
		 System.out.println(cp.getCourse());
	}  

}
