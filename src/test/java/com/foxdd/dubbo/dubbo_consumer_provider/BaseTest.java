package com.foxdd.dubbo.dubbo_consumer_provider;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.foxdd.dubbo.dubbo_interface.People;
import com.foxdd.dubbo.dubbo_interface.SpeakInterface;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { 
		"classpath*:/META-INF/spring/spring-context.xml",
		"classpath*:/META-INF/spring/spring-dubbo-provider.xml",
		"classpath*:/META-INF/spring/spring-dubbo-consumer.xml"})
public class BaseTest {

	@Resource
	private SpeakInterface speakInterfaceConsumer;
	
	@Test
	public void test(){
		People people = new People();
		people.setAge(18);
		people.setName("dubboTest");
		speakInterfaceConsumer.speak(people);
	}
	
	
}
