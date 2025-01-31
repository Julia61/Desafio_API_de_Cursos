package br.com.juliasilva.main.casoDeUso;

import br.com.juliasilva.main.entidades.PropriedadesEntidade;
import br.com.juliasilva.main.repositorio.CursosRepositorio;
import br.com.juliasilva.main.repositorio.ListarCursosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ListarCursosServico {

    @Autowired
    private ListarCursosRepositorio listarCursosRepositorio;

    public List<PropriedadesEntidade> listarTodos() {
        return listarCursosRepositorio.findAll();
    }

    public PropriedadesEntidade buscarPorId(UUID id) {
        return listarCursosRepositorio.findById(id)
                .orElseThrow(() -> new RuntimeException("Curso não encontrado com o ID: " + id));
    }

}
