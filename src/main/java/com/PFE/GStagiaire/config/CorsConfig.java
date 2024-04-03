package com.PFE.GStagiaire.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//CorsConfig.java
@Configuration
public class CorsConfig implements WebMvcConfigurer {

 @Override
 public void addCorsMappings(CorsRegistry registry) {
     registry.addMapping("/**")
             .allowedOrigins("*")
             .allowedMethods("*")
             .allowedHeaders("*");
 }
}













