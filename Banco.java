import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Banco implements Imprimivel {

	public Banco() {
		// TODO Auto-generated constructor stub
	}
	public static ArrayList<ContaBancaria> Contas = new ArrayList<ContaBancaria>();
	
	
	public static void adicionarConta(ContaBancaria conta) {
		if(procurarConta(conta.numeroConta) == null) {
			Banco.Contas.add(conta);
		}
	}
	public static void removerConta(ContaBancaria conta) {
		Banco.Contas.remove(procurarConta(conta.numeroConta));
	}
	public static ContaBancaria procurarConta(String numConta) {
		
		for(int i = 0 ; i < Banco.Contas.size() ; i++) {
			if(Banco.Contas.get(i).numeroConta.equals(numConta)) {
				return Banco.Contas.get(i);
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		ContaCorrente umaconta = new ContaCorrente();
		umaconta.numeroConta = "111";
		umaconta.saldo = 100;
		Banco.adicionarConta(umaconta);
		Banco.procurarConta("111").mostrarDados();
		Banco.removerConta(Banco.procurarConta("111"));
		if(Banco.procurarConta("111") == null) {
			System.out.println("a conta 111 foi deletada");
		}
		
	}
	@Override
	public void mostrarDados() {
		// TODO Auto-generated method stub
		
	}
}
