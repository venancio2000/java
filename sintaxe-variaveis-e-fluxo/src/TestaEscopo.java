
public class TestaEscopo {
	public static void main(String[] args) {
		
		System.out.println("Testando condicional");
		
		int idade = 18;
		int quantidade = 3;
		
		//boolean acompanhado = quantidade >= 2;
		boolean acompanhado;
		if(quantidade >= 2) {
			acompanhado = true;
		}else {
			acompanhado = false;
		}
		
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo!");
		} else {

			System.out.println("infelizmente voce nao pode entrar");

		}
	}
}
