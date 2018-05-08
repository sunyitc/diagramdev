package org.SC_S_FEIGN_Cient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="ribbon-consumer",fallback = FeignFallback_Feign.class)
public interface HelloFeignClient {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello();
}
