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
	
	public void cadastrarAluno(String nome, String num_matricula, String periodo_ingresso) throws Exception {
		
		if(!empty(nome) && !empty(num_matricula) && !empty(periodo_ingresso) && !exists(num_matricula)) {
			
			Aluno novoAluno = new Aluno();
			novoAluno.setNome(nome);
			novoAluno.setNum_matricula(num_matricula);
			novoAluno.setPeriodo_ingresso(periodo_ingresso);
			
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
	
	public boolean exists(String num_matricula) {
		
		for(Aluno al : alunos) {
			
			if(al.getNum_matricula() == num_matricula) {
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
		for (AlunoDisciplina alunoDisciplina : aluno.getDisciplinas_cursadas())
			chTotal += alunoDisciplina.getComponente_curricular().getDisciplina().getCarga_horaria();
		return chTotal;
	}
	
	public int calculaChOb(Aluno aluno) {
		int chOb = 0;
		for (AlunoDisciplina alunoDisciplina : aluno.getDisciplinas_cursadas())
			if(alunoDisciplina.getComponente_curricular().getNatureza()== "OB")
				chOb += alunoDisciplina.getComponente_curricular().getDisciplina().getCarga_horaria();
		return chOb;
	}
	
	public int calculaChOp(Aluno aluno) {
		int chOp = 0;
		for (AlunoDisciplina alunoDisciplina : aluno.getDisciplinas_cursadas())
			if(alunoDisciplina.getComponente_curricular().getNatureza()== "OP")
				chOp += alunoDisciplina.getComponente_curricular().getDisciplina().getCarga_horaria();
		return chOp;
	}
	
	public int calculaCr(Aluno aluno) {
		int cr = 0;
		for (AlunoDisciplina alunoDisciplina : aluno.getDisciplinas_cursadas())
			cr += alunoDisciplina.getNota();
		return cr/aluno.getDisciplinas_cursadas().size();
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
	    
	    for(AlunoDisciplina ad : aluno.getDisciplinas_cursadas()) {
    		escreverArquivo.println("-" + ad.getComponente_curricular().getDisciplina().getNome() + " "+ ad.getComponente_curricular().getDisciplina().getCodigo() + " "+ ad.getComponente_curricular().getDisciplina().getCarga_horaria() + " "+ ad.getComponente_curricular().getNatureza() + " "+ ad.getNota() + " "+ ad.getConceito());
   		}
	    escreverArquivo.close();
	}
}
