package Aulas_Java_Udemy;
import java.util.Locale;
public class aula_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		int idade;
		double salario,altura;
		char genero;
		String nome;
		
		idade = 30;
		salario = 5000.5;
		altura = 1.72 ;
		genero = 'F';
		nome = "Maria Silva ";
		
		System.out.println("Idade = "+ idade);
		System.out.println("Salario = " + String.format("%.2f", salario));
		System.out.println("Altura = " + altura);
		System.out.println("Genero "+ genero);
		System.out.println("Nome = "+ nome);
		
		
		
		
	

	
	}
}
