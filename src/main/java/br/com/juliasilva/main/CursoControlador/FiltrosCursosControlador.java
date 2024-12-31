package br.com.juliasilva.main.CursoControlador;

import br.com.juliasilva.main.casoDeUso.RetornoCursos;
import br.com.juliasilva.main.entidades.PropriedadesEntidade;
import br.com.juliasilva.main.repositorio.FiltrarCursosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class FiltrosCursosControlador {

    @RestController
    @RequestMapping("/propriedades")
    public class PropriedadesEntidadeController {

        @Autowired
        private RetornoCursos retornoCursos;

        @GetMapping
        public List<PropriedadesEntidade> listarEntidades(
                @RequestParam(required = false) String nome,
                @RequestParam(required = false) String categoria) {
            return retornoCursos.listarEntidades(nome, categoria);

        }

    }

}


