package br.ufba.mata62.team4.domain;

import java.io.IOException;

import br.ufba.mata62.team4.controller.UniversidadeController;
import br.ufba.mata62.team4.service.*;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		AlunoService alunoService = new AlunoService();
		CursoService cursoService = new CursoService();
		
		Curso cc = new Curso("1", "Ciencia da computacao");
		Curso si = new Curso("2","Sistemas de informacao");
		Curso lc = new Curso("3","Licenciatura em Computacao");
		
		Disciplina engSoft = new Disciplina("MATA63", "Engenharia de Software II", 68);
		ArrayList<ComponenteCurricular> compCur = new ArrayList<ComponenteCurricular>();
		ComponenteCurricular compCC = new ComponenteCurricular(engSoft, cc, "exatas");
		ComponenteCurricular compSI = new ComponenteCurricular(engSoft, si, "exatas");
		ComponenteCurricular compLC = new ComponenteCurricular(engSoft, lc, "exatas");
		Semestre sem_6 = new Semestre("6 Semestre", cc);
		Semestre sem_5 = new Semestre("5 Semestre", si);
		compCur.add(compCC);
		sem_6.setDisciplinas(compCur);
		ArrayList<Semestre> semestres = new ArrayList<Semestre>();
		semestres.add(sem_6);
		semestres.add(sem_5);
		cc.setDisc_obrigatorias(semestres);
		semestres.remove(0);
		semestres.add(sem_5);
		si.setDisc_obrigatorias(semestres);
		compCur.remove(0);
		compCur.add(compSI);
		sem_5.setDisciplinas(compCur);
		compCur.remove(0);
		compCur.add(compLC);
		lc.setDisc_optativas(compCur);

		Aluno aluno = new Aluno();
		aluno.setNome("Aluno Teste");
		aluno.setNum_matricula("123");
		aluno.setCurso(cc);
		ArrayList<AlunoDisciplina> disc_cursadas = new ArrayList<AlunoDisciplina>();
		AlunoDisciplina ad = new AlunoDisciplina(aluno, compCC);
		disc_cursadas.add(ad);
		aluno.setDisciplinas_cursadas(disc_cursadas);
		aluno.getDisciplinasCursadas().get(0).setConceito(Conceito.Aprovado);
		aluno.getDisciplinasCursadas().get(0).setNota(7);
		System.out.println(cc.getDiscObrigatorias().get(0).getDisciplinas().get(0).getNatureza());
		System.out.println(lc.getDiscOptativas().get(0).getDisciplina().getNome());
		System.out.println(si.getDiscObrigatorias().get(0).getNome_semestre());
		System.out.println(aluno.getDisciplinasCursadas().get(0).getComponenteCurricular().getDisciplina().getNome());
		System.out.println(aluno.getDisciplinasCursadas().get(0).getNota());
		
		
		cursoService.getCurso().addDisciplinaCurso(compLC);
		cursoService.getCurso().addDisciplinaCurso(compSI);
		cursoService.getCurso().addDisciplinaCurso(compCC);
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("marcos");
		aluno2.setNum_matricula("1234");
		
		Aluno aluno3 = new Aluno();
		aluno3.setNome("carlos");
		aluno3.setNum_matricula("12345");
		
		cursoService.getCurso().addAluno(aluno);
		cursoService.getCurso().addAluno(aluno2);
		cursoService.getCurso().addAluno(aluno3);
		ArrayList<Aluno> alunos = cursoService.getCurso().getAlunos();
		double cr = 5.0;
		for(Aluno al: alunos) {
			al.setcR(cr);
			cr++;
		}
		
		cursoService.imprimeCurriculoCursoTXT(cc);
		
		alunoService.imprimeHistoricoTXT(aluno);
		
		UniversidadeController uni = new UniversidadeController();
		uni.main(args);
		
	}

}
