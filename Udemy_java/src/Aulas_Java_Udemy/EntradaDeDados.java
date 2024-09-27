package Aulas_Java_Udemy;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome1,nome2;
		double salario1,salario2;
		int idade;
		char sexo ;
		
		System.out.println("Digite o nome da primeira pessoa");
		nome1 = sc.nextLine();
		System.out.println("Digite o salario da primeira pessoa: ");
		salario1 = sc.nextDouble();
		
		System.out.println("Digite o nome da segunda pessoa");
		sc.nextLine();
		nome2 = sc.nextLine();
		System.out.println("Digite o salario da 2 pessoa ");
		salario2 = sc.nextDouble();
		
		System.out.println("Salario de "+ nome1 +" eh " + salario1 +" Nome da 2 pessoa eh : " + nome2 + " e o seu salario eh : "+ salario2);
				
	
	}

}
