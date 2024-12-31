package br.com.juliasilva.main.Excecao;

public class EncontradaExcecao extends  RuntimeException{

    public EncontradaExcecao() {
        super("Curso já existe");
    }

}
