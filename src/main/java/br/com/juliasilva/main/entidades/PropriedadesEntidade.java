package br.com.juliasilva.main.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity(name = "Cursos")
public class PropriedadesEntidade {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String nome;

    private String categoria;

    private boolean ativo;

    @CreationTimestamp
    private LocalDateTime criadaEm;

    @UpdateTimestamp
    private LocalDateTime atualizadaEm;
}
