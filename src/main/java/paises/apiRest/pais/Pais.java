package paises.apiRest.pais;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Table(name = "paises")
@Entity(name = "Pais")
@Getter
@NoArgsConstructor
public class Pais {
    @Getter(AccessLevel.NONE)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    @JdbcTypeCode(SqlTypes.BIGINT)
    private Long id;

    private String nome;
    private String capital;
    private String regiao;
    private String subRegiao;
    private String area;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pais(DadosCadastroPais dados) {

        this.nome = dados.nome();
        this.capital = dados.capital();
        this.regiao = dados.regiao();
        this.subRegiao = dados.subRegiao();
        this.area = dados.area();
    }

    public void actualizarInformacoes(DadosActualizacaoPais dados) {

        if(dados.regiao() != null)
        {
            this.regiao = dados.regiao();
        }

        if(dados.area() !=null) {
            this.area = dados.area();
        }
    }
}
