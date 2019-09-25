package com.ibm.financing.credit.Controller;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan("com.ibm")
public class AppConfig {

//	@Bean
//	RestTemplate restTemplate() {
//		RestTemplate restTemplate = new RestTemplate();
//		MappingJacksonHttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
//		converter.setObjectMapper(new ObjectMapper());
//		restTemplate.getMessageConverters().add(converter);
//		return restTemplate;
//	}
}
