package paises.apiRest.controller;


import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import paises.apiRest.pais.*;

@RestController
@RequestMapping("paises")
public class PaisesController {

    @Autowired
    private PaisRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroPais dados){
        repository.save(new Pais(dados));
    }

    @GetMapping
    public Page<DadosListagemDoPais> listar(@PageableDefault(size = 10,sort = {"id"}) Pageable paginacao){
        return repository.findAll(paginacao).map(DadosListagemDoPais::new);
    }

    @PutMapping
    @Transactional
    public void actualizar(@RequestBody @Valid DadosActualizacaoPais dados ){
        var pais = repository.getReferenceById(dados.id());
        pais.actualizarInformacoes(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void removerPais(@PathVariable Long id){
        repository.deleteById(id);
    }

}
