package entidades;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Curso cc = new Curso("1", "Ciência da Computação");
		Curso si = new Curso("2","Sistemas de Informação");
		Curso lc = new Curso("3","Licenciatura da Computação");
		
		Disciplina engSoft = new Disciplina("MATA63", "Engenharia de Software II", 68);
		ArrayList<ComponenteCurricular> compCur = new ArrayList<ComponenteCurricular>();
		ComponenteCurricular compCC = new ComponenteCurricular(engSoft, cc, "exatas");
		ComponenteCurricular compSI = new ComponenteCurricular(engSoft, si, "exatas");
		ComponenteCurricular compLC = new ComponenteCurricular(engSoft, lc, "exatas");
		Semestre sem_6 = new Semestre("6° Semestre", cc);
		Semestre sem_5 = new Semestre("5° Semestre", si);
		compCur.add(compCC);
		sem_6.setDisciplinas(compCur);
		ArrayList<Semestre> semestres = new ArrayList<Semestre>();
		semestres.add(sem_6);
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
		
		System.out.println(cc.getDisc_obrigatorias().get(0).getDisciplinas().get(0).getNatureza());
		System.out.println(lc.getDisc_optativas().get(0).getDisciplina().getNome());
		System.out.println(si.getDisc_obrigatorias().get(0).getNome_semestre());
		
	}

}
