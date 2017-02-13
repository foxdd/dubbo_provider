package com.foxdd.dubbo.dubbo_consumer_provider;

import org.springframework.stereotype.Component;

import com.foxdd.dubbo.dubbo_interface.People;
import com.foxdd.dubbo.dubbo_interface.SpeakInterface;

@Component("speakInterfacev2")
public class SpeakInterfaceImplv2 implements SpeakInterface {

	public String speak(People people) {
		// TODO Auto-generated method stub
		return "version 2 dubbo return" + people.getAge();
	}

}
