package classes_entidades;

public class ContaBanco {

	private int numeroConta;
	private String nomeTitular;
	private double depInicial;
	private double saldo;
	private double valor;
	
	
	public ContaBanco(int numeroConta, String nomeTitular, double depInicial) {
		
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		depositar(depInicial);
	}
	
	public ContaBanco(int numeroConta, String nomeTitular) {
		
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		
	}
	
	public ContaBanco() {
		
		
	}


	public String getNomeTitular() {
		return nomeTitular;
	}


	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}


	public int getNumeroConta() {
		return numeroConta;
	}
	
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}


	public double getDepInicial() {
		return depInicial;
	}
	
	
	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public double getSaldo() {
		return saldo;
	}


	public void depositar(double valor) {
		
		saldo += valor;
		
	}
	
	public void sacar(double valor) {
		
		
		saldo = saldo - valor + 5;
	}
	
	public String toString() {
		return "Conta "
				+ numeroConta
				+ ", Titular: "
				+ nomeTitular
				+ ", Saldo: $ "
				+ String.format("%.2f", saldo);
	}
	
	
}
