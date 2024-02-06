package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSeriesFilmes(@JsonAlias("title") String name,
                                @JsonAlias("budget") Integer budget,
                                @JsonAlias("vote_average") String rated
                         ) {
}
