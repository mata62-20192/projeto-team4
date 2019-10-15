package services;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
/*
 * 	Criação de alunos da universidade, com nome, número de matrícula (é um identificador único) e senha. Cada aluno pertence a apenas um curso.
	Criação de histórico de um aluno: lista de componentes curriculares cursados por semestre, indicando código, nome, carga horária, natureza, 
	nota e conceito (aprovado, reprovado por nota, reprovado por falta, dispensa, trancamento). Só existe nota quando o conceito é aprovado ou 
	reprovado por nota.
	Impressão do histórico, com cálculo da carga horária total (optativa e obrigatória) e CR (nota média) do aluno. Considere que o CR é calculado 
	através da média simples das notas.
	A impressão dos histórico deve poder ser feita em dois formatos diferentes: TXT e HTML
	Impressão do currículo do curso, que lista disciplinas obrigatórias, por semestre, e optativas, informando, para cada disciplina, o código, o nome, e a carga horária.
 * 
 */
public class SistemaAcademico {

	public static void main(String[] args) {

	}
	public void gerarHistoricoAluno() throws IOException {
		//um simples exemplo de gravar em arquivo para gerar o historico do aluno
		Scanner ler = new Scanner(System.in);
	    int i, n;
	 
	    System.out.printf("Informe o número para a tabuada:\n");
	    n = ler.nextInt();
	 
	    FileWriter arq = new FileWriter("d:\\tabuada.txt");
	    PrintWriter gravarArq = new PrintWriter(arq);
	 
	    gravarArq.printf("+--Resultado--+%n");
	    for (i=1; i<=10; i++) {
	      gravarArq.printf("| %2d X %d = %2d |%n", i, n, (i*n));
	    }
	    gravarArq.printf("+-------------+%n");
	 
	    arq.close();
	 
	    System.out.printf("\nTabuada do %d foi gravada com sucesso em \"d:\\tabuada.txt\".\n", n);
	}

}
