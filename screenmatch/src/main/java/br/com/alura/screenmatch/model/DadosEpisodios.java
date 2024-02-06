package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosEpisodios(@JsonAlias("name") String titulo,
                             @JsonAlias("episode_number") Integer episodioNumero,
                             @JsonAlias("vote_average") String avaliacao,
                             @JsonAlias("air_date") String dataLancamento) {
}
