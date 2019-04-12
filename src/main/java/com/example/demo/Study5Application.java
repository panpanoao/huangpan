package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication //启动类注解
/*@EnableTransactionManagement //事务
@EnableScheduling  //用于定时任务*/
/*@ImportResource("classpath:spring-config-center.xml")*/
public class Study5Application extends SpringBootServletInitializer  implements CommandLineRunner /* WebMvcConfigurerAdapter */{


	protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder){
                 return applicationBuilder.sources(Study5Application.class);
	}


/*	public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
		configurer.favorPathExtension(false);
	}*/


	public static void main(String[] args) {
		SpringApplication.run(Study5Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}



	}
