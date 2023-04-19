
public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o screen match!");
        System.out.println("Filme: Top gun: maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de Lancamento: " + anoDeLancamento);
        boolean incluindoNoPlano = true;

        double notaDoFilme = 8.1;
        System.out.println("Nota do Filme " + notaDoFilme);

        double media = (9.8 + 6.1 + 8.0) /3;
        System.out.println(media);

        String sinopses = """
                Filne: Top gun:maverick
                Filmes de arventura com galã dos anos 80
                Bom filme!
                nota do filme: """ + notaDoFilme;

        System.out.println(sinopses);

       int classificacao;
       classificacao = (int) (media /2);
        System.out.println(classificacao);

    }
}