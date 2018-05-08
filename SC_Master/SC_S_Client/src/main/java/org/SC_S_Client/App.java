package org.SC_S_Client;

import org.SC_S_Common.Abc;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */

/*eureka:
	  client:
	    service-url:
	      defaultZone : http://slave1:8761/eureka/
	     
	server:
	  port: 8763

	spring:
	  application:
	    name: eureka-client*/

 
@EnableEurekaClient
@SpringBootApplication
@RestController
public class App 
{
    public static void main( String[] args )
    {
    	Abc.test();
        System.out.println( "Hello World!" );
        SpringApplication.run(App.class, args);
    }
    
    @Value("${server.port}")
    String port;
    
    @RequestMapping("/hi")
    public String hi() {
        System.out.println( "Hello World!" +"  "+ port);
    	return "hi ...........";
    }
    
	@Value("${foo}")
	String foo;
	@RequestMapping(value = "/test")
	public String test(){
		return foo;
	}
}
