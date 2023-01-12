package paises.apiRest.pais;

public record DadosListagemDoPais(Long id, String nome, String capital, String area) {

    public DadosListagemDoPais(Pais pais) {
        this(pais.getId(), pais.getNome(), pais.getCapital(), pais.getArea());
    }

}
