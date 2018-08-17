
public class ContaPoupanca extends ContaBancaria {
	public double limite = 100;
	public ContaPoupanca() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mostrarDados() {
		System.out.println("Num:"+this.numeroConta);
		System.out.println("Saldo:"+this.saldo);
		System.out.println("limite:"+this.limite);

	}

	@Override
	void sacar(double valor) {
		if(this.saldo > valor) {
		this.saldo -= valor;}
		else {
			if(this.saldo >= this.limite) {
				this.saldo -= valor;
			}
		}
	}

	@Override
	void depositar(double valor) {
		this.saldo += valor;

	}

}
