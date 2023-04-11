class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;
    
    public Conta(int agencia, int numero) {
    	Conta.total++;
    	System.out.println("o total de contas é " + total);
    	this.agencia = agencia;
    	this.numero = numero;
    	System.out.println("incio da contrução");
    	
    }
    
    public void deposita(double valor) {
    	this.saldo += valor;
    }
    
    public boolean saca(double valor) {
    	if(this.saldo >= valor) {
    		this.saldo -= valor;
    		return true;
    	}
    	return false;
    }
    public boolean tranfere(double valor, Conta origem) {
    	if (this.saldo >= valor) {
    		this.saldo -= valor;
    		origem.deposita(valor);
    		return true;
    	}
    	return false;
    }
    public double getSaldo() {

    	return this.saldo;
    }
    public void setNumero(int numero) {
    	if(numero <= 0) {
    		System.out.println("Valor não pode ser negativo");
    	}
    	this.numero = numero;
    }
    public int getNumero() {
		return this.numero;
	}
    public int getAgencia() {
		return agencia;
	}
    public void setAgencia(int agencia) {
    	if(agencia <= 0) {
    		System.out.println("não pode valor menor igual a 0");
    		return;
    	}
		this.agencia = agencia;
	}
    public void setTitular(Cliente titular) {
    	this.titular = titular;
    }
    public Cliente getTitular() {
    	return this.titular;
    }
    public static int getTotal() {
    	return Conta.total;
    }
    
}