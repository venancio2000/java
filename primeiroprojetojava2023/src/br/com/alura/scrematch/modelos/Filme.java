package br.com.alura.scrematch.modelos;

public class Filme extends Titulo {

    private String diretor;

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
    public String getDiretor(){ return this.diretor; }
}
