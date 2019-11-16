package br.ufba.mata62.team4.domain;

public class AlunoDisciplina {
	private Aluno aluno;
	private ComponenteCurricular componente_curricular;
	private Conceito conceito;
	private double nota;
	
	public AlunoDisciplina(Aluno aluno, ComponenteCurricular componente_curricular) {
		super();
		this.aluno = aluno;
		this.componente_curricular = componente_curricular;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public ComponenteCurricular getComponente_curricular() {
		return componente_curricular;
	}

	public void setComponente_curricular(ComponenteCurricular componente_curricular) {
		this.componente_curricular = componente_curricular;
	}

	public Conceito getConceito() {
		return conceito;
	}

	public void setConceito(Conceito conceito) {
		this.conceito = conceito;
	}

	public double getNota() {
		return nota;
	}

	public boolean setNota(double nota) {
		if(this.conceito == Conceito.Aprovado || this.conceito == Conceito.ReprovadoPorNota) {
			this.nota = nota;	
			return true;
		}else {
			return false;
		}
	}
	
	
	
}
