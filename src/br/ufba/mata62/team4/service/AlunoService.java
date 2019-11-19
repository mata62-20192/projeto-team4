package br.ufba.mata62.team4.service;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import br.ufba.mata62.team4.domain.Aluno;

import br.ufba.mata62.team4.domain.AlunoDisciplina;
import br.ufba.mata62.team4.domain.Curso;

public class AlunoService {
	
	private ArrayList<Aluno> alunos;
	
	public void cadastrarAluno(String nome, String numMatricula, String periodongresso) throws Exception {
		
		if(!empty(nome) && !empty(numMatricula) && !empty(periodongresso) && !exists(numMatricula)) {
			
			Aluno novoAluno = new Aluno();
			novoAluno.setNome(nome);
			novoAluno.setNum_matricula(numMatricula);
			novoAluno.setPeriodo_ingresso(periodongresso);
			
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
		for (AlunoDisciplina alunoDisciplina : aluno.getDisciplinasCursadas())
			chTotal += alunoDisciplina.getComponenteCurricular().getDisciplina().getCargaHoraria();
		return chTotal;
	}
	
	public int calculaChOb(Aluno aluno) {
		int chOb = 0;
		for (AlunoDisciplina alunoDisciplina : aluno.getDisciplinasCursadas())
			if(alunoDisciplina.getComponenteCurricular().getNatureza()== "OB")
				chOb += alunoDisciplina.getComponenteCurricular().getDisciplina().getCargaHoraria();
		return chOb;
	}
	
	public int calculaChOp(Aluno aluno) {
		int chOp = 0;
		for (AlunoDisciplina alunoDisciplina : aluno.getDisciplinasCursadas())
			if(alunoDisciplina.getComponenteCurricular().getNatureza()== "OP")
				chOp += alunoDisciplina.getComponenteCurricular().getDisciplina().getCargaHoraria();
		return chOp;
	}
	
	public int calculaCr(Aluno aluno) {
		int cr = 0;
		for (AlunoDisciplina alunoDisciplina : aluno.getDisciplinasCursadas())
			cr += alunoDisciplina.getNota();
		return cr/aluno.getDisciplinasCursadas().size();
	}

	public void imprimeHistoricoTXT(Aluno aluno) throws IOException {
		FileWriter arquivo = new FileWriter("historico.txt");
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
	}
}
