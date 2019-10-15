package services;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
/*
 * 	Cria��o de alunos da universidade, com nome, n�mero de matr�cula (� um identificador �nico) e senha. Cada aluno pertence a apenas um curso.
	Cria��o de hist�rico de um aluno: lista de componentes curriculares cursados por semestre, indicando c�digo, nome, carga hor�ria, natureza, 
	nota e conceito (aprovado, reprovado por nota, reprovado por falta, dispensa, trancamento). S� existe nota quando o conceito � aprovado ou 
	reprovado por nota.
	Impress�o do hist�rico, com c�lculo da carga hor�ria total (optativa e obrigat�ria) e CR (nota m�dia) do aluno. Considere que o CR � calculado 
	atrav�s da m�dia simples das notas.
	A impress�o dos hist�rico deve poder ser feita em dois formatos diferentes: TXT e HTML
	Impress�o do curr�culo do curso, que lista disciplinas obrigat�rias, por semestre, e optativas, informando, para cada disciplina, o c�digo, o nome, e a carga hor�ria.
 * 
 */
public class SistemaAcademico {

	public static void main(String[] args) {

	}
	public void gerarHistoricoAluno() throws IOException {
		//um simples exemplo de gravar em arquivo para gerar o historico do aluno
		Scanner ler = new Scanner(System.in);
	    int i, n;
	 
	    System.out.printf("Informe o n�mero para a tabuada:\n");
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
