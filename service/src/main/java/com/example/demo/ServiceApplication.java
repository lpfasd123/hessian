package com.example.demo;

import com.example.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.caucho.HessianServiceExporter;

@SpringBootApplication
public class ServiceApplication {

	@Autowired
	private HelloService helloService;

	@Bean(name = "/HelloService")
	public HessianServiceExporter accountService() {
		HessianServiceExporter exporter = new HessianServiceExporter();
		exporter.setService(helloService);
		exporter.setServiceInterface(HelloService.class);
		return exporter;
	}



	public static void main(String[] args) {
		SpringApplication.run(ServiceApplication.class, args);
	}
}
