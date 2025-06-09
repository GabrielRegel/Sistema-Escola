package escolaSystem;

public class Aluno extends Pessoa {
	private String curso;
	private String turma;
	
	public Aluno(String nome, int idade, String email, String cpf, String curso, String turma) {
		super(nome, idade, email, cpf);
		this.curso = curso;
		this.turma = turma;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	
	public void estudar() {
	    System.out.println(getNome() + " está estudando " + curso + " na turma " + turma + ".");
	}

	@Override
	public void apresentar() {
		System.out.println("Sou o aluno de " + curso + " da turma " + turma + ".");
	}
}
