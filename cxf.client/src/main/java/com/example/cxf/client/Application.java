package com.example.cxf.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.cxf.CountryEndpoint;
import com.example.cxf.MultipartContent;
import com.example.cxf.MultipartEndpoint;

import jakarta.activation.DataHandler;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		var context = SpringApplication.run(Application.class, args);
		
		var client = context.getBean(CountryEndpoint.class);
		var param = new com.example.cxf.GetCountryParam();
		param.setName("Spain");
		var result = client.getCountry(param);
		System.out.println(result.getCurrency().name());

		var multipartClient = context.getBean(MultipartEndpoint.class);
		var multipartContent = new MultipartContent();
		var attachment = new DataHandler("This is a sample data", "text/plain");
		multipartContent.setDataBytes(attachment);
		multipartContent.setContentName("sample.txt");
		multipartClient.store("my-action", multipartContent);
	}

}
