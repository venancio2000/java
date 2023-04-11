
public class TestaGeteSet {
 public static void main(String[] args) {
	Conta conta = new Conta(1137, 4578);
	conta.deposita(100);
	System.out.println(conta.getSaldo());
	
	Cliente bruno = new Cliente();
	
	conta.setTitular(bruno);

	bruno.setNome("Bruno VEnancio rodrigues da silva");
	System.out.println(bruno.getNome());
	System.out.println(conta.getTitular().getNome());
	
	conta.getTitular().setProfissao("Programador");
	
	
	//agora em duas linhas
	Cliente titulaDaConta = conta.getTitular();
	
	System.out.println(titulaDaConta.getProfissao());
	conta.setNumero(1315);
	System.out.println(conta.getNumero());
}
}
