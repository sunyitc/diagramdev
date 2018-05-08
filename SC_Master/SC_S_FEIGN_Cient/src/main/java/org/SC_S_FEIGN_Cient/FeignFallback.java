package org.SC_S_FEIGN_Cient;

import org.springframework.stereotype.Component;

@Component
public class FeignFallback implements HiFeignClient {
    public String hi() {
    	return "error  可能超时了";
    }
}
