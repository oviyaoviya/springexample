package com.mbf;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
/*@ComponentScan(basePackageClasses="com.mbf");*/
public class MvcConfig extends WebMvcConfigurerAdapter   {
	 public void addResourceHandlers(ResourceHandlerRegistry registry) {
		 System.out.println("configuring uploaded images :");
	        registry
	          .addResourceHandler("/upload/**")
	          .addResourceLocations("file:/home/user/upload/"); 
	    }

}

