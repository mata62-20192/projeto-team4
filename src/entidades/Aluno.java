package entidades;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Aluno {
	
	private String num_matricula;
	private String nome_aluno;
	private String periodo_ingresso;
	private Curso curso;
	private String contato;
	private ArrayList<AlunoDisciplina> disciplinas_cursadas;

	public ArrayList<AlunoDisciplina> getDisciplinas_cursadas() {
		return disciplinas_cursadas;
	}
	public void setDisciplinas_cursadas(ArrayList<AlunoDisciplina> disciplinas_cursadas) {
		this.disciplinas_cursadas = disciplinas_cursadas;
	}
	
	public String getNum_matricula() {
		return num_matricula;
	}
	public void setNum_matricula(String num_matricula) {
		this.num_matricula = num_matricula;
	}
	public String getNome() {
		return contato;
	}
	public void setNome(String nome) {
		this.nome_aluno = nome;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	public String getPeriodo_ingresso() {
		return periodo_ingresso;
	}
	public void setPeriodo_ingresso(String periodo_ingresso) {
		this.periodo_ingresso = periodo_ingresso;
	}
	
	public int calculaChTotal() {
		int chTotal = 0;
		for (AlunoDisciplina alunoDisciplina : disciplinas_cursadas)
			chTotal += alunoDisciplina.getComponente_curricular().getDisciplina().getCarga_horaria();
		return chTotal;
	}
	
	public int calculaChOb() {
		int chOb = 0;
		for (AlunoDisciplina alunoDisciplina : disciplinas_cursadas)
			if(alunoDisciplina.getComponente_curricular().getNatureza()== "OB")
				chOb += alunoDisciplina.getComponente_curricular().getDisciplina().getCarga_horaria();
		return chOb;
	}
	
	public int calculaChOp() {
		int chOp = 0;
		for (AlunoDisciplina alunoDisciplina : disciplinas_cursadas)
			if(alunoDisciplina.getComponente_curricular().getNatureza()== "OP")
				chOp += alunoDisciplina.getComponente_curricular().getDisciplina().getCarga_horaria();
		return chOp;
	}
	
	public int calculaCr() {
		int cr = 0;
		for (AlunoDisciplina alunoDisciplina : disciplinas_cursadas)
			cr += alunoDisciplina.getNota();
		return cr/disciplinas_cursadas.size();
	}

	public void imprimeHistoricoTXT() throws IOException {
		FileWriter arquivo = new FileWriter("historico.txt");
	    PrintWriter escreverArquivo = new PrintWriter(arquivo);
	    escreverArquivo.println("Historico");
	    escreverArquivo.println("Aluno: " + nome_aluno);
	    escreverArquivo.println("Curso: " + this.getCurso().getNome());
	    escreverArquivo.println("Carga horaria obrigatoria cursada: " + calculaChOb());
	    escreverArquivo.println("Carga horaria optativa cursada: " + calculaChOp());
	    escreverArquivo.println("Carga horaria total cursada: " + calculaChTotal());
	    escreverArquivo.println("Coeficiente de rendimento: " + calculaCr());
	    
	    for(AlunoDisciplina ad : this.getDisciplinas_cursadas()) {
    		escreverArquivo.println("-" + ad.getComponente_curricular().getDisciplina().getNome() + " "+ ad.getComponente_curricular().getDisciplina().getCodigo() + " "+ ad.getComponente_curricular().getDisciplina().getCarga_horaria() + " "+ ad.getComponente_curricular().getNatureza() + " "+ ad.getNota() + " "+ ad.getConceito());
   		}
	    escreverArquivo.close();
	}
	
}
