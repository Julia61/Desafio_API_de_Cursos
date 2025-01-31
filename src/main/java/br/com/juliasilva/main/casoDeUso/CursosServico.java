package br.com.juliasilva.main.casoDeUso;

import br.com.juliasilva.main.Excecao.CursoNaoEncontradoExcecao;
import br.com.juliasilva.main.entidades.PropriedadesEntidade;
import br.com.juliasilva.main.repositorio.CursosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CursosServico {

    @Autowired
    private CursosRepositorio cursosRepositorio;


    public PropriedadesEntidade atualizarCampos(UUID id, PropriedadesEntidade propriedadesEntidade) {
        PropriedadesEntidade cursoExistente = cursosRepositorio.findById(id)
                .orElseThrow(CursoNaoEncontradoExcecao::new);

        if(propriedadesEntidade.getNome() != null) {
            cursoExistente.setNome(propriedadesEntidade.getNome());
        }

        if(propriedadesEntidade.getCategoria() != null) {
            cursoExistente.setCategoria(propriedadesEntidade.getCategoria());
        }

        return cursosRepositorio.save(cursoExistente);
    }


}
