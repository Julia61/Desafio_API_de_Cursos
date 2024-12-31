package br.com.juliasilva.main.CursoControlador;

import br.com.juliasilva.main.casoDeUso.CriarNovoCurso;
import br.com.juliasilva.main.entidades.PropriedadesEntidade;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cursos")
public class CursoControlador {

    @Autowired
    private CriarNovoCurso criarNovoCurso;

    @PostMapping("/novoCursos")
    public ResponseEntity<Object> novoCursos(@Valid @RequestBody PropriedadesEntidade propriedadesEntidade) {
        try {
            var resultado = this.criarNovoCurso.execute(propriedadesEntidade);
            return ResponseEntity.ok().body(resultado);
        }catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
