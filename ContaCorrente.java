
public class ContaCorrente extends ContaBancaria {
	public double taxaOperacao = 1;
	
	public ContaCorrente() {
		// TODO Auto-generated constructor stub
	}

	@Override
	void sacar(double valor) {
		if(this.saldo > (0 + valor + this.taxaOperacao)) {
		this.saldo -= (valor + this.taxaOperacao);}
		
	}

	@Override
	void depositar(double valor) {
		this.saldo += (valor-this.taxaOperacao);
		
	}

	@Override
	public void mostrarDados() {
		System.out.println("Num:"+this.numeroConta);
		System.out.println("Saldo:"+this.saldo);
		System.out.println("taxa:"+this.taxaOperacao);

	}

}
