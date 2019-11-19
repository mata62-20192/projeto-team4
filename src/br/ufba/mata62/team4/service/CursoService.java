package br.ufba.mata62.team4.service;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import br.ufba.mata62.team4.domain.Aluno;
import br.ufba.mata62.team4.domain.ComponenteCurricular;
import br.ufba.mata62.team4.domain.Curso;
import br.ufba.mata62.team4.domain.Semestre;
import br.ufba.mata62.team4.domain.Universidade;

public class CursoService {
	
private static Curso curso = new Curso("Banco de Dados", "MATA-55");


public void cadastrarAluno(String nome, String num_matricula, String periodo_ingresso) throws IllegalStateException,IllegalArgumentException {
	
		if(empty(nome) || empty(num_matricula) || empty(periodo_ingresso)) {
			throw new  IllegalStateException("Nao eh possivel adicionar um aluno sem nome, matricula ou semestre.");
		}
		
		if(exists(num_matricula, nome)) {
			throw new IllegalArgumentException("Aluno ja faz parte do curso.");
		}

		if(!empty(nome) && !empty(num_matricula) && !empty(periodo_ingresso)) {
			
			Aluno novoAluno = new Aluno();
			novoAluno.setNome(nome);
			novoAluno.setNum_matricula(num_matricula);
			novoAluno.setPeriodo_ingresso(periodo_ingresso);
			curso.addAluno(novoAluno);
			
		}

	}
	public ArrayList<Aluno> getAlunos() {
		
		if(curso == null) {
			return new ArrayList<Aluno>();
		}
		
		return curso.getAlunos();
		

	}
	
	public boolean exists(String num_matricula, String nome) {
		
		for(Aluno al : curso.getAlunos()) {
			
			if(al.getNum_matricula().contentEquals(num_matricula)) {
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
	    for (Semestre semestre : curso.getDisc_obrigatorias()) {
	    	int i = 1;
	    	//escreverArquivo.println(i + "� semestre:");
	    	escreverArquivo.println(semestre.getNome_semestre());
	    	for(ComponenteCurricular cc : semestre.getDisciplinas()) {
	    		escreverArquivo.println("-" + cc.getDisciplina().getCodigo() + " "+ cc.getDisciplina().getNome() + " "+  cc.getDisciplina().getCarga_horaria());
	   		}
	   	}
	    escreverArquivo.close();
	}
}
