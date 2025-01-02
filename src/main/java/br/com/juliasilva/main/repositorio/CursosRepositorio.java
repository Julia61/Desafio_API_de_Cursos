package br.com.juliasilva.main.repositorio;

import br.com.juliasilva.main.entidades.PropriedadesEntidade;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface CursosRepositorio extends JpaRepository<PropriedadesEntidade, UUID> {

}
