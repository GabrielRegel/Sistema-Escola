package escolaSystem;

public class Professor extends Pessoa {
	private String diciplina;
	private String formacao;
	
	public Professor(String nome, int idade, String email, String cpf, String diciplina, String formacao) {
		super(nome, idade, email, cpf);
		this.diciplina = diciplina;
		this.formacao = formacao;
	}

	public String getDiciplina() {
		return diciplina;
	}

	public void setDiciplina(String diciplina) {
		this.diciplina = diciplina;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	
	public void darAula() {
	    System.out.println(getNome() + " formado em " + formacao + " está dando aula de " + diciplina + ".");
	}
	
	@Override
	public void apresentar() {
		System.out.println("Sou professor formado em " + formacao + " e dou aula de " + diciplina + ".");
	}
}
