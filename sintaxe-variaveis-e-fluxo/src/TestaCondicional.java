
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Testando condicional");

		int idade = 17;
		int quantidade = 3;
		if (idade >= 18) {
			System.out.println("Voce tem mais de 18 anos");
			System.out.println("Seja bem vindo!");
		}else {
			if(quantidade >= 2) {
				System.out.println("voce nao tem 18, mas pode entrar," + "pois está acompanhado");
			}else {
				System.out.println("infelizmente voce nao pode entrar");
			}
			
		}
	}
}
