package br.ufba.mata62.team4.service;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import br.ufba.mata62.team4.domain.Aluno;
import br.ufba.mata62.team4.domain.ComponenteCurricular;
import br.ufba.mata62.team4.domain.Curso;
import br.ufba.mata62.team4.domain.Semestre;
import br.ufba.mata62.team4.domain.Universidade;

public class CursoService {
	
private static Curso curso = new Curso("Banco de Dados", "MATA-55");


public void cadastrarAluno(String nome, String numMatricula, String periodoIngresso) throws IllegalStateException,IllegalArgumentException {
	
		if(empty(nome) || empty(numMatricula) || empty(periodoIngresso)) {
			throw new  IllegalStateException("Nao eh possivel adicionar um aluno sem nome, matricula ou semestre.");
		}
		
		if(exists(numMatricula, nome)) {
			throw new IllegalArgumentException("Aluno ja faz parte do curso.");
		}

		if(!empty(nome) && !empty(numMatricula) && !empty(periodoIngresso)) {
			
			Aluno novoAluno = new Aluno();
			novoAluno.setNome(nome);
			novoAluno.setNum_matricula(numMatricula);
			novoAluno.setPeriodo_ingresso(periodoIngresso);
			curso.addAluno(novoAluno);
			
		}

	}

public Curso getCurso() {
	return curso;
}

	public ArrayList<ComponenteCurricular> getComponentes() {
		
		if(curso == null) {
			return new ArrayList<ComponenteCurricular>();
		}
		
		ArrayList<ComponenteCurricular> componentes = new ArrayList<ComponenteCurricular>();
		ArrayList<ComponenteCurricular> optativas = curso.getDiscOptativas();
		for (ComponenteCurricular componente : optativas) {
			componentes.add(componente);
		}
		ArrayList<Semestre> semestres = curso.getDiscObrigatorias();
		for (Semestre semestre : semestres) {
			ArrayList<ComponenteCurricular> obrigatorias = semestre.getDisciplinas();
			for (ComponenteCurricular componente : obrigatorias) {
				componentes.add(componente);
			}
		}
		return componentes;
	}

	public ArrayList<Aluno> getAlunos() {
		
		if(curso == null) {
			return new ArrayList<Aluno>();
		}
		
		return curso.getAlunos();
	}
	
	public boolean exists(String numMatricula, String nome) {
		
		for(Aluno al : curso.getAlunos()) {
			
			if(al.getNum_matricula().contentEquals(numMatricula)) {
				return true;
			}
			
			if(al.getNome().contentEquals(nome)) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean empty( final String s ) {
		  // Null-safe, short-circuit evaluation.
		  return s == null || s.trim().isEmpty();
		}
	
	
	public void imprimeCurriculoCursoTXT(Curso curso) throws IOException {
		FileWriter arquivo = new FileWriter("curriculoCurso.txt");
	    PrintWriter escreverArquivo = new PrintWriter(arquivo);
	    escreverArquivo.println("Curriculo de " + curso.getNome());
	    escreverArquivo.println(" ");
	    escreverArquivo.println("Componentes curriculares:");
	    for (Semestre semestre : curso.getDiscObrigatorias()) {
	    	int i = 1;
	    	//escreverArquivo.println(i + "� semestre:");
	    	escreverArquivo.println(semestre.getNome_semestre());
	    	for(ComponenteCurricular cc : semestre.getDisciplinas()) {
	    		escreverArquivo.println("-" + cc.getDisciplina().getCodigo() + " "+ cc.getDisciplina().getNome() + " "+  cc.getDisciplina().getCargaHoraria());
	   		}
	   	}
	    escreverArquivo.close();
	}
	
}
