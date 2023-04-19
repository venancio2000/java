package br.com.alura.scrematch.calculo;
import br.com.alura.scrematch.modelos.Titulo;

public class CalculadoDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void inclui(Filme f){
//        this.tempoTotal += f.getDuracaoEmminutos();
//    }
//    public void inclui(Serie s){
//        this.tempoTotal += s.getDuracaoEmminutos();
//    }

    public void inclui(Titulo titulo){
        System.out.println("Adicionando duração em minutos de " + titulo);
        this.tempoTotal += titulo.getDuracaoEmminutos();
    }
}
