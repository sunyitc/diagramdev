package org.SC_S_FEIGN_Cient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
	@Autowired
	HiFeignClient hiFeignClient;
	
	@Autowired
	HelloFeignClient helloFeignClient;
	
    @RequestMapping("/hi")
    public String hi() {
    	return hiFeignClient.hi();
    }
    @RequestMapping("/hello")
    public String hello() {
    	return helloFeignClient.hello();
    }
}
