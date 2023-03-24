public class TestaMetodo {
 
	public static void main(String[] args) {
		Conta contaDoBruno = new Conta();
		contaDoBruno.saldo = 100;
		contaDoBruno.deposita(50);
		
		System.out.println(contaDoBruno.saldo);
	}
}
