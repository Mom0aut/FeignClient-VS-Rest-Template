package at.showcase.resttemplate.service;

import at.showcase.model.ResponseJoke;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class RestTemplateService {
    
    private final RestTemplate restTemplate = new RestTemplate();

    public String loadRandomJoke() {
        ResponseEntity<ResponseJoke> url = restTemplate.getForEntity("http://api.icndb.com/jokes/random", ResponseJoke.class);
        return url.getBody().getValue().getJoke();
    }

}
