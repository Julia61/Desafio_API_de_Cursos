package br.com.juliasilva.main.casoDeUso;

import br.com.juliasilva.main.Excecao.CursoNaoEncontradoExcecao;
import br.com.juliasilva.main.entidades.PropriedadesEntidade;
import br.com.juliasilva.main.repositorio.AtivoOuInativoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ExpressionException;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.UUID;

@Service
public class AtivoInativoServico {

    @Autowired
    private AtivoOuInativoRepositorio ativoOuInativoRepositorio;


    public PropriedadesEntidade atualizarAtivoInativo(UUID id, String ativoInativo){
        PropriedadesEntidade cursoExisti = ativoOuInativoRepositorio.findById(id)
                .orElseThrow(CursoNaoEncontradoExcecao::new);
       if(ativoInativo.equalsIgnoreCase("sim")){
           cursoExisti.setAtivo("Sim");

       } else if (ativoInativo.equalsIgnoreCase("não")) {
           cursoExisti.setAtivo("Não");
       }


        return ativoOuInativoRepositorio.save(cursoExisti);

    }


}
