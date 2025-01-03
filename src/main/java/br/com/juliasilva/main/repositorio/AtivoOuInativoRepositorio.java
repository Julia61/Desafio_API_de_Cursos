package br.com.juliasilva.main.repositorio;

import br.com.juliasilva.main.entidades.PropriedadesEntidade;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AtivoOuInativoRepositorio extends JpaRepository<PropriedadesEntidade, UUID> {

}
