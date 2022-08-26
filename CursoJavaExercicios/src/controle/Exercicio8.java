package exercicioControle;

import java.util.Scanner;

public class Exercicio8 {

	/**
	 * 8. Criar um programa que receba uma palavra e imprime no console letra por
	 * letra.
	 */

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite uma palavra: ");
		String palavra = entrada.next();
		String suport = palavra;
		int tamanho = palavra.length();

		for(int i = 0; i < tamanho; i++) {
			palavra = suport;
			System.out.printf("%s", palavra.substring(0,1));
			System.out.println();
			suport = suport.substring(1);
		}
		
		entrada.close();
	}
}
