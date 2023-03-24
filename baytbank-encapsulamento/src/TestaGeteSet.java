
public class TestaGeteSet {
 public static void main(String[] args) {
	Conta conta = new Conta();
	conta.deposita(100);
	System.out.println(conta.getSaldo());
	
	 conta.titular = new Cliente();
	
	conta.titular.nome  = "Bruno Venancio";
	System.out.println(conta.titular.nome);
	
	conta.setNumero(1315);
	System.out.println(conta.getNumero());
}
}
