package br.ufba.mata62.team4.service;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import br.ufba.mata62.team4.domain.Aluno;

import br.ufba.mata62.team4.domain.AlunoDisciplina;
import br.ufba.mata62.team4.domain.ComponenteCurricular;
import br.ufba.mata62.team4.domain.Curso;

public class AlunoService {
	
	private ArrayList<Aluno> alunos;
	
	public void cadastrarAluno(String nome, String numMatricula, Curso curso) throws Exception {
		
		if(!empty(nome) && !empty(numMatricula) && !exists(numMatricula)) {
			Aluno novoAluno = new Aluno(nome, numMatricula, curso);
			novoAluno.setNome(nome);
			novoAluno.setNum_matricula(numMatricula);
			novoAluno.setCurso(curso);
			this.alunos.add(novoAluno);
		}	
		throw new Exception();
	}
	
	public Aluno getAluno(String aluno) {
		for(Aluno al : alunos) {
			if(al.getNome() == aluno) {
				return al;
			}	
		}
		return null;
	}
	
	public boolean exists(String numMatricula) {
		for(Aluno al : alunos) {
			if(al.getNum_matricula() == numMatricula) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean empty( final String s ) {
		  // Null-safe, short-circuit evaluation.
		  return s == null || s.trim().isEmpty();
		}
	
	
	public int calculaChTotal(Aluno aluno) {
		int chTotal = 0;
		if(aluno.getDisciplinasCursadas().isEmpty()) {
			return 0;
		}else {
			for (AlunoDisciplina alunoDisciplina : aluno.getDisciplinasCursadas())
				chTotal += alunoDisciplina.getComponenteCurricular().getDisciplina().getCargaHoraria();
			return chTotal;
		}
	}
	
	public int calculaChOb(Aluno aluno) {
		int chOb = 0;
		if(aluno.getDisciplinasCursadas().isEmpty()) {
			return 0;
		}else {
			for (AlunoDisciplina alunoDisciplina : aluno.getDisciplinasCursadas())
				if(alunoDisciplina.getComponenteCurricular().getNatureza()== "OB")
					chOb += alunoDisciplina.getComponenteCurricular().getDisciplina().getCargaHoraria();
			return chOb;
		}
	}
	
	public int calculaChOp(Aluno aluno) {
		int chOp = 0;
		if(aluno.getDisciplinasCursadas().isEmpty()) {
			return 0;
		}else {
			for (AlunoDisciplina alunoDisciplina : aluno.getDisciplinasCursadas())
				if(alunoDisciplina.getComponenteCurricular().getNatureza()== "OP")
					chOp += alunoDisciplina.getComponenteCurricular().getDisciplina().getCargaHoraria();
			return chOp;
		}
	}
	
	public double calculaCr(Aluno aluno) {
		double cr = 0.0;
		if(aluno.getDisciplinasCursadas().isEmpty()) {
			return 0.0;
		}else {
		for (AlunoDisciplina alunoDisciplina : aluno.getDisciplinasCursadas())
			cr += alunoDisciplina.getNota();
			return cr/aluno.getDisciplinasCursadas().size();
		}
	}

	public void imprimeHistoricoTXT(Aluno aluno) throws IOException {
		try {
			FileWriter arquivo = new FileWriter("Historico de "+aluno.getNome()+".txt");
		    PrintWriter escreverArquivo = new PrintWriter(arquivo);
		    escreverArquivo.println("Historico");
		    escreverArquivo.println("Aluno: " + aluno.getNome());
		    escreverArquivo.println("Curso: " + aluno.getCurso().getNome());
		    escreverArquivo.println("Carga horaria obrigatoria cursada: " + calculaChOb(aluno));
		    escreverArquivo.println("Carga horaria optativa cursada: " + calculaChOp(aluno));
		    escreverArquivo.println("Carga horaria total cursada: " + calculaChTotal(aluno));
		    escreverArquivo.println("Coeficiente de rendimento: " + calculaCr(aluno));
		    
		    for(AlunoDisciplina ad : aluno.getDisciplinasCursadas()) {
	    		escreverArquivo.println("-" + ad.getComponenteCurricular().getDisciplina().getNome() + " "+ ad.getComponenteCurricular().getDisciplina().getCodigo() + " "+ ad.getComponenteCurricular().getDisciplina().getCargaHoraria() + " "+ ad.getComponenteCurricular().getNatureza() + " "+ ad.getNota() + " "+ ad.getConceito());
	   		}
		    escreverArquivo.close();
		    System.out.println("Imprimiu historico do aluno " + aluno.getNome() + " em arquivo txt criado na pasta do projeto");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void imprimeHistoricoHTML(Aluno aluno) throws IOException {
		FileWriter arquivo = new FileWriter("Historico de "+aluno.getNome()+".html");
	    PrintWriter escreverArquivo = new PrintWriter(arquivo);
	    escreverArquivo.println("<!DOCTYPE html>");
	    escreverArquivo.println("<html lang=\"pt-br\">");
	    escreverArquivo.println("	<head>");
	    escreverArquivo.println("		<title> Historico HTML </title>");
	    escreverArquivo.println("	</head>");
	    escreverArquivo.println("	<body>");
	    escreverArquivo.println("		<p>Aluno: " + aluno.getNome() + "</p>");
	    escreverArquivo.println("		<p>Curso: " + aluno.getCurso().getNome() + "</p>");
	    escreverArquivo.println("		<p>Carga horaria obrigatoria cursada: " + calculaChOb(aluno) + "</p>");
	    escreverArquivo.println("		<p>Carga horaria optativa cursada: " + calculaChOp(aluno) + "</p>");
	    escreverArquivo.println("		<p>Carga horaria total cursada: " + calculaChTotal(aluno) + "</p>");
	    escreverArquivo.println("		<p>Coeficiente de rendimento: " + calculaCr(aluno) + "</p>"); 
	    for(AlunoDisciplina ad : aluno.getDisciplinasCursadas()) {
    		escreverArquivo.println("		<p>" + ad.getComponenteCurricular().getDisciplina().getNome() +" "+ ad.getComponenteCurricular().getDisciplina().getCodigo() +" "+ ad.getComponenteCurricular().getDisciplina().getCargaHoraria() +" "+ ad.getComponenteCurricular().getNatureza() +" "+ ad.getNota() +" "+ ad.getConceito() + "</p>");
   		}
	    escreverArquivo.println("	</body>");
	    escreverArquivo.println("</html>");  
	    escreverArquivo.close();
	    System.out.println("Imprimiu historico do aluno " + aluno.getNome() + " em arquivo html criado na pasta do projeto");
	}
	
	public void addComponente(Aluno aluno, ComponenteCurricular componente) {	
		
	}
}