package entidades;

public class Aluno {
	
	private String num_matricula;
	private String nome_aluno;
	private String periodo_ingresso;
	private Curso curso;
	private String contato;
	
	public String getNum_matricula() {
		return num_matricula;
	}
	public void setNum_matricula(String num_matricula) {
		this.num_matricula = num_matricula;
	}
	public String getNome() {
		return contato;
	}
	public void setNome(String nome) {
		this.nome_aluno = nome;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	public String getPeriodo_ingresso() {
		return periodo_ingresso;
	}
	public void setPeriodo_ingresso(String periodo_ingresso) {
		this.periodo_ingresso = periodo_ingresso;
	}
	
}
