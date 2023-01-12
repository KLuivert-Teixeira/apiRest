package paises.apiRest.pais;

import jakarta.validation.constraints.NotNull;

public record DadosActualizacaoPais(
        @NotNull
        Long id,

        String regiao,

        String area) {


}
