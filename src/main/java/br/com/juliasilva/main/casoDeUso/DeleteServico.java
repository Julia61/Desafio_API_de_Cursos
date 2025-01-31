package br.com.juliasilva.main.casoDeUso;

import br.com.juliasilva.main.Excecao.CursoNaoEncontradoExcecao;
import br.com.juliasilva.main.entidades.PropriedadesEntidade;
import br.com.juliasilva.main.repositorio.DeletandoRepositorio;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class DeleteServico {

    @Autowired
    private DeletandoRepositorio deletandoRepositorio;

    public void deletando(UUID id) {
        PropriedadesEntidade cursoExisti = deletandoRepositorio.findById(id)
                .orElseThrow(CursoNaoEncontradoExcecao::new);
        deletandoRepositorio.delete(cursoExisti);
    }


}
