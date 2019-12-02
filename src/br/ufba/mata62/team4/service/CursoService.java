package br.ufba.mata62.team4.service;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import br.ufba.mata62.team4.domain.Aluno;
import br.ufba.mata62.team4.domain.ComponenteCurricular;
import br.ufba.mata62.team4.domain.Curso;
import br.ufba.mata62.team4.domain.Semestre;

public class CursoService {
	
	private static Curso curso = new Curso("1", "Sistemas de informacao");
	
	public void cadastrarAluno(String nome, String numMatricula, String semestre) throws IllegalStateException,IllegalArgumentException {
		
			if(empty(nome) || empty(numMatricula)) {
				throw new  IllegalStateException("Nao eh possivel adicionar um aluno sem nome, matricula ou semestre.");
			}
			if(exists(numMatricula, nome)) {
				throw new IllegalArgumentException("Aluno ja faz parte do curso.");
			}
			if(!empty(nome) && !empty(numMatricula)) {
				Aluno novoAluno = new Aluno(nome, numMatricula, curso);
				novoAluno.setNome(nome);
				novoAluno.setNum_matricula(numMatricula);
				novoAluno.setCurso(curso);
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
	
	public void imprimeCurriculoCursoTXT() throws IOException {
		FileWriter arquivo = new FileWriter("Curriculo de "+ curso.getNome()+ ".txt");
	    PrintWriter escreverArquivo = new PrintWriter(arquivo);
	    escreverArquivo.println("Curriculo de " + curso.getNome());
	    escreverArquivo.println(" ");
	    escreverArquivo.println("Componentes curriculares:");
	    ArrayList<ComponenteCurricular> componentes = this.getComponentes();
	    for (ComponenteCurricular cmp : componentes) {
	    	escreverArquivo.println("-" + cmp.getDisciplina().getCodigo() + " "+ cmp.getDisciplina().getNome() + " "+  cmp.getDisciplina().getCargaHoraria());
		}
	    escreverArquivo.close();
	}
}