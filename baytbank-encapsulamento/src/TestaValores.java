
public class TestaValores {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 24226);
		
		
		System.out.println(conta.getAgencia());
		
		Conta conta1 = new Conta(1234, 45788);
		
		System.out.println(conta1.getNumero());
		System.out.println(Conta.getTotal());
	}
}
