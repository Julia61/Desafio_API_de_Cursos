package br.com.juliasilva.main.casoDeUso;

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


    public PropriedadesEntidade atualizarAtivoInativo(UUID id, boolean verdadeiroOuFalso){
        PropriedadesEntidade cursoExisti = ativoOuInativoRepositorio.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Curso não encontradoo"));


       if(verdadeiroOuFalso){
           cursoExisti.setAtivo(true);

       }

       if(!verdadeiroOuFalso){
           cursoExisti.setAtivo(false);
       }
        return ativoOuInativoRepositorio.save(cursoExisti);

    }


}
