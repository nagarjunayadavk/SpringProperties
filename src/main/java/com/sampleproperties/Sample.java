package com.sampleproperties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Sample {

	public static void main(String[] args) {
		ApplicationContext appContext = new FileSystemXmlApplicationContext("appContext.xml");
		
		
		Fruit f = appContext.getBean("fruit", Fruit.class);
      	Vegitable v = (Vegitable)appContext.getBean("vegitable");
		
		System.out.println(f.talkYourSelf());
		System.out.println(v.talkYourSelf());
      	
		Fruit propertieFruit = (Fruit) appContext.getBean("propertieFruit");
		
		System.out.println("Properties Test ::"+propertieFruit.talkYourSelf());
		
		((FileSystemXmlApplicationContext) appContext).close();

	}

}
