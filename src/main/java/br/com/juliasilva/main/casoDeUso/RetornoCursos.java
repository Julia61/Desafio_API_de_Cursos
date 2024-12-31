package br.com.juliasilva.main.casoDeUso;

import br.com.juliasilva.main.Excecao.EncontradaExcecao;
import br.com.juliasilva.main.entidades.PropriedadesEntidade;
import br.com.juliasilva.main.repositorio.FiltrarCursosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RetornoCursos {

    @Autowired
    private FiltrarCursosRepositorio filtrarCursosRepositorio;

    public List<PropriedadesEntidade> listarEntidades(String nome, String categoria) {
        if (nome != null && categoria != null) {
            return filtrarCursosRepositorio.findByNomeAndCategoria(nome, categoria);
        } else if (nome != null) {
            return filtrarCursosRepositorio.findByNome(nome);
        } else if (categoria != null) {
            return filtrarCursosRepositorio.findByCategoria(categoria);
        }
        return filtrarCursosRepositorio.findAll();
    }


}
