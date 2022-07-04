package at.showcase.feign.controller;

import at.showcase.feign.service.FeignService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class FeignController {

    private final FeignService feignService;

    @GetMapping("api/feign")
    public String loadJoke() {
        return feignService.loadRandomJoke();
    }
}
