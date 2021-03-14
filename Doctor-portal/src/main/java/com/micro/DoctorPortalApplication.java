package com.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.micro.configuration.LoadConfiguration;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "Doc-Ser", configuration = LoadConfiguration.class)
public class DoctorPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoctorPortalApplication.class, args);
	}

}
