package br.com.juliasilva.main.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Cursos")
public class PropriedadesEntidade {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String nome;

    private String categoria;

    private String ativo;

    private String professor;

    @CreationTimestamp
    private LocalDateTime criadaEm;

    @UpdateTimestamp
    private LocalDateTime atualizadaEm;
}
