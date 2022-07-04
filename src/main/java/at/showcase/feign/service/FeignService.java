package at.showcase.feign.service;

import at.showcase.feign.client.JokeClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FeignService {

    private final JokeClient jokeClient;

    public String loadRandomJoke() {
        return jokeClient.loadRandomJoke().getValue().getJoke();
    }

}
