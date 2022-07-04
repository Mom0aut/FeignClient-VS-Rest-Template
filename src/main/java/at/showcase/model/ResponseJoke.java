package at.showcase.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ResponseJoke {

    private String type;
    @JsonProperty("value")
    private JokeValue value;
}
