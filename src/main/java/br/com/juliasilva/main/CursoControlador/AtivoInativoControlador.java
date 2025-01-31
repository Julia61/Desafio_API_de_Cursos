package br.com.juliasilva.main.CursoControlador;

import br.com.juliasilva.main.casoDeUso.AtivoInativoServico;
import br.com.juliasilva.main.entidades.PropriedadesEntidade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/cursos")
public class AtivoInativoControlador {

    @Autowired
    private AtivoInativoServico ativoInativoServico;

    @PatchMapping("/ativoInativo/{id}")
    public ResponseEntity<PropriedadesEntidade> atualizar(@PathVariable UUID id, @RequestBody String inativoOunao){

        PropriedadesEntidade inativoAtivo = ativoInativoServico.atualizarAtivoInativo(id,inativoOunao);

        return ResponseEntity.ok(inativoAtivo);
    }

}
