import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double nota = 0;
        double mediaAvaliacao = 0;
        int totalDeNotas = 0;

        while (nota != -1){
            System.out.println("Diga sua avaliação para o filme ou -1 para encerrar: ");
            nota = scanner.nextDouble();

            if (nota != -1){
                mediaAvaliacao += nota;
                totalDeNotas++;
            }

        }
        System.out.println("Media da nota e: " + mediaAvaliacao / totalDeNotas);
    }
}
