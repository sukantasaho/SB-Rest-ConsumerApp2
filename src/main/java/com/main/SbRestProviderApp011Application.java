package com.main;

 

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

 

@SpringBootApplication
public class SbRestProviderApp011Application 
{
          private static final String GET_ALL_DOCTORS="http://localhost:8080/api/getAllDoctors";
         // private static final String 
          
        static  RestTemplate template = new RestTemplate();
	public static void main(String[] args) 
	{
		SpringApplication.run(SbRestProviderApp011Application.class, args);
		callGetAllDoctors();
		 
	}
	public static void callGetAllDoctors()
	{
		HttpHeaders header = new HttpHeaders();
		header.setAccept(Arrays.asList(MediaType.APPLICATION_XML));
		
		HttpEntity<String> entity = new HttpEntity<>("parameters",header);
		  ResponseEntity<String> result = template.exchange(GET_ALL_DOCTORS, HttpMethod.GET, entity, String.class);
		  System.out.println(result);
	}

}
