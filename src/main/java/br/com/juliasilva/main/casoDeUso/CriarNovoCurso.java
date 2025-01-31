package br.com.juliasilva.main.casoDeUso;


import br.com.juliasilva.main.Excecao.EncontradaExcecao;
import br.com.juliasilva.main.entidades.PropriedadesEntidade;
import br.com.juliasilva.main.repositorio.NovoCursoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CriarNovoCurso {

    @Autowired
    private NovoCursoRepositorio novoCursoRepositorio;

    public PropriedadesEntidade execute(PropriedadesEntidade propriedadesEntidade) {
        return this.novoCursoRepositorio.save(propriedadesEntidade);

    }

}
