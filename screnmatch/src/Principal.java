import br.com.alura.scrematch.modelos.Filme;

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
        System.out.println(meufilme.getDuracaoEmminutos());
        meufilme.exibeFichaTecnica();

        meufilme.avalia(8);
        meufilme.avalia(5);
        meufilme.avalia(10);
        System.out.println("Total de avaliacoes: " + meufilme.getTotalDeAvaliacoes());
        System.out.println("nota media do filme: " + meufilme.pegaMedia());


        System.out.println();

    }
}