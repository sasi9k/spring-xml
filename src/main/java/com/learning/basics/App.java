package com.learning.basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learning.basics.service.SpeakerService;
import com.learning.basics.service.SpeakerServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//    	SpeakerService speakerService = new SpeakerServiceImpl();
    	
    	SpeakerService speakerService = appContext.getBean("speakerService",SpeakerService.class);
    	
        System.out.println( "Hello World! "+ speakerService.getSpeakers().get(0).getFirstName() );
    }
}
