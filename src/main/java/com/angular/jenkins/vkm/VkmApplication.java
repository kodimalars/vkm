package com.angular.jenkins.vkm;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@SpringBootApplication
public class VkmApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(VkmApplication.class, args);
	}

	/*
	 * @Bean public WebMvcConfigurer corsConfigurer() { return new
	 * WebMvcConfigurerAdapter() {
	 * @Override public void addCorsMappings(CorsRegistry registry) {
	 * registry.addMapping("/**").allowedOrigins("*"); } }; }
	 */

	@Bean // above also worked ; both working
	public CorsFilter corsFilter()
	{
		CorsConfiguration config = new CorsConfiguration();
		config.setAllowCredentials(true);
		config.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
		config.setAllowedHeaders(Arrays.asList("Origin", "Access-Control-Allowed-Origin", "Content-Type", "Accept",
				"Authorization", "Origin, Accept", "Access-Control-Request-Method", "Access-Control-Request-Header"));
		config.setAllowedMethods(Arrays.asList("GET", "POST", "PUT","DELETE"));
		config.setExposedHeaders(Arrays.asList("Origin", "Content-Type", "Accept", "Authorization", "Origin, Accept",
				"Access-Control-Allowed-Origin", "Access-Control-Allowed-Credentials"));
		UrlBasedCorsConfigurationSource configSource = new UrlBasedCorsConfigurationSource();
		configSource.registerCorsConfiguration("/**", config);
		return new CorsFilter(configSource);
	}

}
