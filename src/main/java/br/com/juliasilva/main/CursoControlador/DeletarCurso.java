package br.com.juliasilva.main.CursoControlador;

import br.com.juliasilva.main.casoDeUso.DeleteServico;
import br.com.juliasilva.main.entidades.PropriedadesEntidade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/deletar")
public class DeletarCurso {

    @Autowired
    private DeleteServico deleteServico;

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletar(@PathVariable UUID id){
       deleteServico.deletando(id);
        return ResponseEntity.ok("Curso deletado com sucesso!");
    }



}
