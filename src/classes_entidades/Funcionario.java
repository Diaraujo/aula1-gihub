package classes_entidades;

public class Funcionario {

	
	public String nome;
	public double salarioBruto;
	public double imposto;
	public double porcentagem;
	
		public double salarioLiquido() {
			
			return salarioBruto -= imposto;
			
		}
		
		public void aumentarSalario(double porcentagem) {
			
			salarioBruto += imposto;
			salarioBruto += (salarioBruto *= porcentagem /100);
			
		}
	
	
	
}
