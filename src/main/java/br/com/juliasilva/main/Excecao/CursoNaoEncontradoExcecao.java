package br.com.juliasilva.main.Excecao;

public class CursoNaoEncontradoExcecao extends RuntimeException{

    public CursoNaoEncontradoExcecao(){
        super("Curso não encontrado");
    }

}
