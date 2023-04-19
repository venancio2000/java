package br.com.alura.scrematch.modelos;

public class Filme {
  private String nome;
  private int anoDeLancamento;
  private boolean icluidoNoPlano;
  private double somaDasAvaliacoes;
  private int totalDeAvaliacoes;
  private int duracaoEmminutos;

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setAnoDeLancamento(int anoDeLancamento){
        this.anoDeLancamento = anoDeLancamento;
    }
    public void setDuracaoEmminutos(int duracaoEmminutos){
        this.duracaoEmminutos = duracaoEmminutos;
    }
    public int getDuracaoEmminutos(){
        return this.duracaoEmminutos;
    }
    public int getAnoDeLancamento(){
        return this.anoDeLancamento;
    }

    public String getNome() {
        return nome;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lanãmento: " + anoDeLancamento);
    }

    public void avalia(double nota){
        this.somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;

    }
    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

}
