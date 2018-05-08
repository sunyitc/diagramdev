package org.SC_S_FEIGN_Cient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="eureka-client",fallback = FeignFallback.class)
public interface  HiFeignClient {
    @RequestMapping("/hi")
    public String hi();
    
 
	
}
