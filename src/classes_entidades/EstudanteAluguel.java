package classes_entidades;

public class EstudanteAluguel {

	private String nome;
	private String email;
	private int quarto;
	private int numQuartos;
	
	
	public EstudanteAluguel(String nome, String email, int quarto) {
		super();
		this.nome = nome;
		this.email = email;
		this.quarto = quarto;
	}


	public String getNome() {
		return nome;
	}


	public String getEmail() {
		return email;
	}


	public int getQuarto() {
		return quarto;
	}


	public int getNumQuartos() {
		return numQuartos;
	}


	public String toString() {
		return nome + ", " + email;
		}
	
	
		
	
	
}
