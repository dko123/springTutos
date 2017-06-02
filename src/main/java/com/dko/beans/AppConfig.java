package com.dko.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration 
public class AppConfig {
	
	;	
	@Bean
	public Mundo mundo(){
		
		return new Mundo();
		
		
	}

}
