package br.com.academic;


public class testePessoa {
	public static void main (String[]args) {
		professor prof = new professor("andre", "almeida", "andre@mgmail.com", 179, 2009, 14000.12, "matematica");
		prof.setEmail("andre.professor@prof.ifce.edu.br");
		prof.setAltura(179);
		prof.setAnoDeNsmnt(2009);
		prof.setSalario(10000);
		System.out.println(prof.exibirProfessor());
		
		aluno student = new aluno("dylan", "mesquita", "info");
		student.setEmail("dylan.mesquita60@aluno.ifce.edu.br");
		student.setAltura(185);
		student.setAnoDeNsmnt(2008);
		student.setNotaFinal(7.2);
		System.out.println(student.exibirAprovacao());		
	}
}
