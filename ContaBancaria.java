
public abstract class ContaBancaria implements Imprimivel{

double saldo;
String numeroConta;


abstract void sacar(double valor);
abstract void depositar(double valor);
}
