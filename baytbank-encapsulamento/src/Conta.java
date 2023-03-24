class Conta {
    private double saldo;
    private int agencia;
    private int numero;
     Cliente titular;
    
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
    	this.numero = numero;
    }
    public int getNumero() {
		return this.numero;

	}
    public int getAgencia() {
		return agencia;
	}
    public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
}