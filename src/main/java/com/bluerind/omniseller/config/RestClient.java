/**
 * 
 */
package com.bluerind.omniseller.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * TODO - Lame implementation
 * 
 * @author Anuj Bhatnagar
 *
 */
@Configuration
public class RestClient {

	@Bean(name = "shopifyRestClient")
	public RestTemplate restTemplate() {
		RestTemplate template = new RestTemplate();
		return template;
	}

}
