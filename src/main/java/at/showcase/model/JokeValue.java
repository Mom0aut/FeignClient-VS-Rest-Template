package at.showcase.model;

import lombok.Data;

@Data
public class JokeValue {
    private long id;
    private String joke;
    private Object[] categories;
}
