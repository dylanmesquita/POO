package br.com.overraid;

public class testePessoa {
	public static void main(String []args) {
	aluno student = new aluno();
	student.dados("dyla", "mesquita");
	student.dados("23928ASDK13", "terceiro ano do ES", 17);
	System.out.println(student.dados());
	
	professor prof = new professor();
	prof.dados("POO", 10560.12);
	prof.dados("Rebeca", "Rivas");
	System.out.println(prof.dados());
	}
}
