package at.showcase.feign.client;

import at.showcase.model.ResponseJoke;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "test", url = "http://api.icndb.com/jokes/random")
public interface JokeClient {

    @GetMapping("/")
    ResponseJoke loadRandomJoke();
    
}
