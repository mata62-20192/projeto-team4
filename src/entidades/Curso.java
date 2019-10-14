package entidades;

public class Curso {
	private String codigo_curso;
	private String nome_curso;

	public Curso(String codigo, String nome) {
		super();
		this.codigo_curso = codigo;
		this.codigo_curso = nome;
	}
	public String getCodigo() {
		return codigo_curso;
	}
	public void setCodigo(String codigo) {
		this.codigo_curso = codigo;
	}
	public String getNome() {
		return codigo_curso;
	}
	public void setNome(String nome) {
		this.codigo_curso = nome;
	}

	
	
}
