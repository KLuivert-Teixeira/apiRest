package paises.apiRest.pais;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroPais(

        @NotBlank
        String nome,
        @NotBlank
        String capital,
        @NotNull
        String regiao,
        @NotNull
        String subRegiao,
        @NotBlank
        String area) {
}
