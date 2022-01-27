package com.szymonchmielewski.cloudGateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.circuitbreaker.resilience4j.Resilience4JCircuitBreakerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("/userServiceFail ")
    public String userServiceFallbackMethod(){
        return "User Service is taking longer than expected. \n Please try again later. :( ";
    }
    @GetMapping("/backofficeServiceFail ")
    public String backofficeServiceFallbackMethod(){
        return "Backoffice Service is taking longer than expected. \n Please try again later. :( ";
    }
}
