package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSeries(@JsonAlias("title") String name,
                          @JsonAlias("episode_number") Integer episodes,
                          @JsonAlias("vote_average") String rated
                         ) {
}
