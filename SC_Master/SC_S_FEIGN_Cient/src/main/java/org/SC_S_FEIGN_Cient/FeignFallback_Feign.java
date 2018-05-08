package org.SC_S_FEIGN_Cient;

import org.springframework.stereotype.Component;

@Component
public class FeignFallback_Feign implements HelloFeignClient {
    public String hello() {
    	return "error  可能超时了";
    }
}
