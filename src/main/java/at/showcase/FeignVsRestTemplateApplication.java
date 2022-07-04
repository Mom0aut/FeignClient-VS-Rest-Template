package at.showcase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignVsRestTemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignVsRestTemplateApplication.class, args);
    }

}
