package com.foxdd.dubbo.dubbo_consumer_provider;

import org.springframework.stereotype.Component;

import com.foxdd.dubbo.dubbo_interface.People;
import com.foxdd.dubbo.dubbo_interface.SpeakInterface;

@Component("speakInterface")
public class SpeakInterfaceImpl implements SpeakInterface {

	public String speak(People people) {
		// TODO Auto-generated method stub
		return "dubbo return" + people.getAge();
	}

}
