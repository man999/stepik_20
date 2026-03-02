package com.example.stepik_20;

import com.example.stepik_20.service.DemoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Stepik20Application implements CommandLineRunner {

	private final DemoService demoService;
	private final ApplicationContext applicationContext;

	public Stepik20Application(DemoService demoService, ApplicationContext applicationContext) {
		this.demoService = demoService;
		this.applicationContext = applicationContext;
	}

	public static void main(String[] args) {
		SpringApplication.run(Stepik20Application.class, args);
//        System.out.println("app is running");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("app is running");
		demoService.processData();
//        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
//        Arrays.stream(beanDefinitionNames).forEach(System.out::println);
//		DemoService demoServiceBean = applicationContext.getBean("demoService", DemoService.class);
		System.out.println();
	}
}