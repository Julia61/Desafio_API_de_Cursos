package br.com.juliasilva.main.CursoControlador;

import br.com.juliasilva.main.casoDeUso.CursosServico;
import br.com.juliasilva.main.entidades.PropriedadesEntidade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/cursos")
public class AtualizarCursos {

    @Autowired
    private CursosServico cursosServico;

    @PutMapping("/{id}")
    public ResponseEntity<PropriedadesEntidade> atualizarCursos(@PathVariable UUID id, @RequestBody PropriedadesEntidade propriedadesEntidade){
        PropriedadesEntidade cursoAtualizado =  cursosServico.atualizarCampos(id, propriedadesEntidade);
        return ResponseEntity.ok(cursoAtualizado);

    }

}

