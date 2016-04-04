package com.dong.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpELMain {

	public static void main(String[] args) {

        // Test SpELLiteral
        // testSpELLiteral();

        // Test SpELClass
        testSpELClass();

	}
	
	private static void testSpELLiteral() {

		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("conf-spel.xml");

		SpELLiteral spelLiteral = ctx.getBean("spELLiteral", SpELLiteral.class);
		
		System.out.println("count:" + spelLiteral.getCount());
		System.out.println("message:" + spelLiteral.getMessage());
		System.out.println("frequency:" + spelLiteral.getFrequency());
		System.out.println("capacity:" + spelLiteral.getCapacity());
		System.out.println("name1:" + spelLiteral.getName1());
		System.out.println("name2:" + spelLiteral.getName2());
		System.out.println("enabled:" + spelLiteral.isEnabled());
		
	}

    private static void testSpELClass() {

        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("conf-spel.xml");

        SpELClass spelClass = ctx.getBean("spELClass", SpELClass.class);

        System.out.println("pi:" + spelClass.getPi());
        System.out.println("randomNumber:" + spelClass.getRandomNumber());

    }


}
