package br.ufba.mata62.team4.domain;

public class AlunoDisciplina {
	private Aluno aluno;
	private ComponenteCurricular componenteCurricular;
	private Conceito conceito;
	private double nota;
	
	public AlunoDisciplina(Aluno aluno, ComponenteCurricular componenteCurricular) {
		super();
		this.aluno = aluno;
		this.componenteCurricular = componenteCurricular;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public ComponenteCurricular getComponenteCurricular() {
		return componenteCurricular;
	}

	public void setComponente_curricular(ComponenteCurricular componenteCurricular) {
		this.componenteCurricular = componenteCurricular;
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
