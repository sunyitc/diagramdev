package org.SC_S_Ribbon_Client.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class ConsumerController {
 
    
    @Autowired
    ConsumerService consumerService;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String hi() {
    	System.out.println("ConsumerController hi .........");
        return consumerService.hi();
    }
    
    
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
    	System.out.println("ConsumerController produce  hello .........");
        return "ConsumerController produce  hello .........";
    }

	@Component
    class ConsumerService {

        @Autowired
        RestTemplate restTemplate;

        @HystrixCommand(fallbackMethod = "fallback")
        public String hi() {
            return restTemplate.getForEntity("http://eureka-client/hi", String.class).getBody();
        }

        public String fallback() {
           	System.out.println("ConsumerController hi  fallback.........");
            return "fallback";
        }

    }
}