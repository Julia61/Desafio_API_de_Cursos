package br.com.juliasilva.main.repositorio;

import br.com.juliasilva.main.entidades.PropriedadesEntidade;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface FiltrarCursosRepositorio extends JpaRepository<PropriedadesEntidade, UUID> {
    List<PropriedadesEntidade> findByNome(String nome);
    List<PropriedadesEntidade> findByCategoria(String categoria);
    List<PropriedadesEntidade> findByNomeAndCategoria(String nome, String categoria);
}
