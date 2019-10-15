package services;

import java.io.File;
import java.util.Scanner;

import entidades.Curso;
import entidades.Disciplina;
import entidades.ComponenteCurricular;
import entidades.Universidade;
// codigo modelo para manipular os dados do arquivo
public class InputDeDados {

	public static void main(String[] args) {
		File file = new File("dados.txt");
		Scanner input = new Scanner(file);

		Universidade universidade = new Universidade();

		int numCursos = input.nextInt();
		for (int i = 0; i < numCursos; i++) {
		    // Le nome
		    input.skip("\n");
		    String nome = input.nextLine();
		    String codigo = input.nextLine();
		    int numDisciplinas = input.nextInt();
		    
		    Curso curso = new Curso(codigo, nome);
		    universidade.addCurso(curso);
		    
		    for (int j = 0; j < numDisciplinas; j++) {
		        // ADMF52 1 OB 34 20102
		        input.skip("\n");
		        String nomeDisc = input.nextLine();
		        String codigoDisc = input.next();
		        int semestre = input.nextInt();
		        String natureza = input.next();
		        int ch = input.nextInt();
		        String curriculo = input.next();
		        
		        Disciplina disciplina = universidade.findDisciplina(codigoDisc);
		        if (disciplina == null) {
		            disciplina = new Disciplina(codigoDisc, nomeDisc, ch);
		            universidade.addDisciplina(disciplina);
		        }
		        ComponenteCurricular disciplinaCurso = new ComponenteCurricular(disciplina, semestre, Natureza.fromString(natureza), new HashSet<Disciplina>()); 
		        curso.addDisciplinaCurso(disciplinaCurso);
		    }
		}

		input.close();

	}

}
