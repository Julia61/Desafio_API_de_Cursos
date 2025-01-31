package br.com.juliasilva.main.CursoControlador;

import br.com.juliasilva.main.casoDeUso.ListarCursosServico;
import br.com.juliasilva.main.entidades.PropriedadesEntidade;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/cursos")
public class ListCourseController {

    @Autowired
    private ListarCursosServico listarCursosServico;

    @GetMapping
    public List<PropriedadesEntidade> listaTodos(){
        return listarCursosServico.listarTodos();
    }

    @GetMapping("/{id}")
    public PropriedadesEntidade buscarPorId(@PathVariable UUID id){
        return listarCursosServico.buscarPorId(id);
    }

}
