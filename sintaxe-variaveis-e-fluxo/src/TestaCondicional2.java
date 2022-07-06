
public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("Testando condicional");
		int	quantidade = 3; 
		boolean acompanhado = quantidade >= 2;
		int idade = 18;
	
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo!");
		} else {

			System.out.println("infelizmente voce nao pode entrar");

		}
	}
}
