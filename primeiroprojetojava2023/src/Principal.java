import br.com.alura.scrematch.calculo.CalculadoDeTempo;
import br.com.alura.scrematch.modelos.Filme;
import br.com.alura.scrematch.modelos.Serie;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Principal {
    public static void main(String[] args) {
        Filme meufilme = new Filme();
        meufilme.setNome("o Poderoso chefão");
        meufilme.setAnoDeLancamento(1970);
        meufilme.setDuracaoEmminutos(180);

        System.out.println(meufilme.getNome());
        System.out.println(meufilme.getAnoDeLancamento());
        System.out.println("Duração do filme:" + meufilme.getDuracaoEmminutos());


        //meufilme.avalia(8);
        //meufilme.avalia(5);
        //meufilme.avalia(10);
        //System.out.println("Total de avaliacoes: " + meufilme.getTotalDeAvaliacoes());
        //System.out.println("nota media do filme: " + meufilme.pegaMedia());

        Filme outrofilme = new Filme();
        outrofilme.setNome("Avatar");
        outrofilme.setAnoDeLancamento(2023);
        outrofilme.setDuracaoEmminutos(200);

        Serie lost = new Serie();

        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setEpisodiosPorTemporada(50);
        System.out.println("Duração para maratonar Lost:" + lost.getDuracaoEmminutos());

        CalculadoDeTempo calculadoDeTempo = new CalculadoDeTempo();
        calculadoDeTempo.inclui(meufilme);
        calculadoDeTempo.inclui(outrofilme);
        calculadoDeTempo.inclui(lost);
        System.out.println(calculadoDeTempo.getTempoTotal());

    }
}