package com.springcore.standalone.collections;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;


public class Test {
	@SuppressWarnings("resource")
public static void  main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/standaloneCollectionsconfig.xml");
	  
	Person  person1 = context.getBean("person1",Person.class);
	System.out.println(person1);
	
}
}
