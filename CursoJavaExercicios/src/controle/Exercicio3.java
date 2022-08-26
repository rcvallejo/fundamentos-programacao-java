package exercicioControle;

import java.util.Scanner;

public class Exercicio3 {
	
	/* 
	 3. Criar um programa que receba duas notas parciais, calcular a média final. 
	 Se a nota do aluno for maior ou igual a 7, imprime Aprovado
	 Se a nota do aluno for maior ou igual a 7 e maior que 4, imprime Recuperação
	 Caso contrário, Reprovado 
	 */
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a primeira nota: ");
		double nota1 = entrada.nextDouble();
		System.out.print("Digite a segunda nota: ");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if(nota1 >= 0 && nota1 <= 10 && nota2 >= 0 && nota2 <= 10) {
			if(media >= 7) {
				System.out.println("O aluno está aprovado!");
			} else if(media >= 4 && media < 7) {
				System.out.println("O aluno está em recuperação!");
			} else
				System.out.println("O aluno está reprovado!");
			} else {
				System.out.println("Notas inválidas!");
			  }
		
		entrada.close();
		
	}
}
