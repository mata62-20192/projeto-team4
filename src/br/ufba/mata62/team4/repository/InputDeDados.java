package br.ufba.mata62.team4.repository;

import java.io.File;
import java.util.Scanner;

import br.ufba.mata62.team4.domain.ComponenteCurricular;
import br.ufba.mata62.team4.domain.Curso;
import br.ufba.mata62.team4.domain.Disciplina;
import br.ufba.mata62.team4.domain.Universidade;

public class InputDeDados {
	private Universidade universidade;
	private String arquivo;
	
	public InputDeDados(Universidade universidade, String arquivo) {
		this.universidade = universidade;
		this.arquivo = arquivo;
	}
	
	public boolean leArquivo() {
		try {
            File file = new File(arquivo);
            Scanner input = new Scanner(file);

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
                    String natureza = input.next();
                    int ch = input.nextInt();
                    
                    Disciplina disciplina = universidade.findDisciplina(codigoDisc);
                    if (disciplina == null) {
                        disciplina = new Disciplina(codigoDisc, nomeDisc, ch);
                        universidade.addDisciplina(disciplina);
                    }
                    ComponenteCurricular componenteCurricular = new ComponenteCurricular(disciplina, curso, natureza);
                    curso.addDisciplinaCurso(componenteCurricular);
                }
            }

            input.close();
            return true;
            
        } catch (Exception e) {
            System.out.println("Deu erro: " + e);
            return false;
        }
	}

}