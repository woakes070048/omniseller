package com.bluerind.omniseller.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * Application Configuration class.
 * 
 * @author Anuj Bhatnagar
 *
 */
@Configuration
@Import(CouchbaseConfig.class)
@ComponentScan("com.bluerind.omniseller")
@PropertySource("classpath:/application.properties")
public class ApplicationConfig {

	public ApplicationConfig() {
	}

}
