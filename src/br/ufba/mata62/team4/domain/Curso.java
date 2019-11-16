package br.ufba.mata62.team4.domain;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Curso {
	
	private String codigo_curso;
	private String nome_curso;
	private ArrayList<Semestre> disc_obrigatorias;
	private ArrayList<ComponenteCurricular> disc_optativas;

	public Curso(String codigo, String nome) {
		super();
		this.codigo_curso = codigo;
		this.codigo_curso = nome;
		this.disc_obrigatorias = new ArrayList<Semestre>();
		this.disc_optativas = new ArrayList<ComponenteCurricular>();
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
	public ArrayList<Semestre> getDisc_obrigatorias() {
		return disc_obrigatorias;
	}
	public void setDisc_obrigatorias(ArrayList<Semestre> disc_obrigatorias) {
		this.disc_obrigatorias = disc_obrigatorias;
	}
	public ArrayList<ComponenteCurricular> getDisc_optativas() {
		return disc_optativas;
	}
	public void setDisc_optativas(ArrayList<ComponenteCurricular> disc_optativas) {
		this.disc_optativas = disc_optativas;
	}
	
	
	public void addDisciplinaCurso(ComponenteCurricular disciplinaCurso) {
		// TODO Auto-generated method stub
		
	}
	public void imprimeCurriculoCursoTXT() throws IOException {
		FileWriter arquivo = new FileWriter("curriculoCurso.txt");
	    PrintWriter escreverArquivo = new PrintWriter(arquivo);
	    escreverArquivo.println("Curriculo de " + this.getNome());
	    escreverArquivo.println(" ");
	    escreverArquivo.println("Componentes curriculares:");
	    for (Semestre semestre : disc_obrigatorias) {
	    	int i = 1;
	    	//escreverArquivo.println(i + "º semestre:");
	    	escreverArquivo.println(semestre.getNome_semestre());
	    	for(ComponenteCurricular cc : semestre.getDisciplinas()) {
	    		escreverArquivo.println("-" + cc.getDisciplina().getCodigo() + " "+ cc.getDisciplina().getNome() + " "+  cc.getDisciplina().getCarga_horaria());
	   		}
	    	//i = i +1;
	   	}
	    escreverArquivo.close();
	}
	
	
}
