package Aulas_Java_Udemy;


public class SaidaDeDadis {

	public static void main(String[] args) {
		
		int idade;
		double salario;
		String nome;
		char sexo;
		
		idade = 32;
		salario = 4500.9;
		nome = "Maria Silva";
		sexo = 'F';
		
		
		System.out.println("A funcionaria "+ nome+" " + sexo +" ganha "+String.format("%.2f", salario)+" e tem"+ idade );
		
		
	}

}
