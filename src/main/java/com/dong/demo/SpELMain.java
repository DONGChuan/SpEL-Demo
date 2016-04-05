package com.dong.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpELMain {

	public static void main(String[] args) {

        // Test SpEL Literal
        // testSpELLiteral();

        // Test SpEL Class
        // testSpELClass();

		// Test SpEL Math
		// testSpELMath();

        // Test SpEL List
        testSpELList();
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

	private static void testSpELMath() {

		ApplicationContext ctx =
				new ClassPathXmlApplicationContext("conf-spel.xml");
		SpELMath spELMath = ctx.getBean("spELMath", SpELMath.class);

		System.out.println("Addition:" + spELMath.getAddition());
		System.out.println("Multiplication:" + spELMath.getMultiplication());
		System.out.println("Division:" + spELMath.getDivision());
		System.out.println("Complementation:" + spELMath.getComplementation());
		System.out.println("Involution:" + spELMath.getInvolution());

	}

    private static void testSpELList() {

        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("conf-spel.xml");

        SpELCityList spelCityList = (SpELCityList) ctx.getBean("spELCityList");

        //ÔÚÏµÍ³¿ØÖÆÌ¨ÖÐ´òÓ¡ÐÅÏ¢
        System.out.println("chosenCity1: " + spelCityList.getChosenCity1().getName());
        System.out.println("chosenCity2: " + spelCityList.getChosenCity1().getName());
        System.out.println("bigCities: " + spelCityList.getBigCities().size());
        System.out.println("aBigCity1: " + spelCityList.getaBigCity1().getName());
        System.out.println("aBigCity2: " + spelCityList.getaBigCity2().getName());
        System.out.println("cityNames1: " + spelCityList.getCityNames1().size());
        System.out.println("cityNames2: " + spelCityList.getCityNames1().size());
        System.out.println("cityNames3: " + spelCityList.getCityNames1().size());
    }

}
