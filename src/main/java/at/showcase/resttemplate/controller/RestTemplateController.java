package at.showcase.resttemplate.controller;

import at.showcase.resttemplate.service.RestTemplateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RestTemplateController {


    private final RestTemplateService restTemplateService;

    @GetMapping("api/rest")
    public String loadRandomJoke() {
        return restTemplateService.loadRandomJoke();
    }
}
