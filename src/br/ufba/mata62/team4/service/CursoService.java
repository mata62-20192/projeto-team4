package br.ufba.mata62.team4.service;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import br.ufba.mata62.team4.domain.ComponenteCurricular;
import br.ufba.mata62.team4.domain.Curso;
import br.ufba.mata62.team4.domain.Semestre;

public class CursoService {
	public void addDisciplinaCurso(ComponenteCurricular disciplinaCurso) {
		// TODO Auto-generated method stub
		
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
	    	//i = i +1;
	   	}
	    escreverArquivo.close();
	}
}
