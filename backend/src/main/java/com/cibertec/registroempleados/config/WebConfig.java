package com.cibertec.registroempleados.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration	
public class WebConfig implements WebMvcConfigurer {
	@Override
	public void addCorsMappings(CorsRegistry corsRegistry) {
		corsRegistry.addMapping("/**").allowedOrigins("*").
		allowedMethods("GET","POST","PUT","PATCH").
		allowedHeaders("*");
	}
}
