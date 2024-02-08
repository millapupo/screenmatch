package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSeries(@JsonAlias("name") String nomeSerie,
                          @JsonAlias("number_of_episodes") Integer numeroEpisodios,
                          @JsonAlias("vote_average") String avaliacao
                         ) {
}
