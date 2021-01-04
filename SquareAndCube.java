package exercicios;

import java.util.Scanner;

/**
 * Feito por Ronyeri Marinho
 * 
 * 04 - Crie um programa que leia um número e calcule seu quadrado e cubo.
 * 
 * */

public class SquareAndCube {

	public static void main(String[] args) {
		
		double numero, quadrado, cubo;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.printf("Digite um número: ");
		numero = keyboard.nextDouble();
		
		quadrado = (numero * numero);
		cubo = ((numero * numero) * numero);
		
		System.out.printf("Número digitado: %.1f", numero);
		System.out.printf("\nNúmero ao quadrado: %.1f", quadrado);
		System.out.printf("\nNúmero ao cubo: %.1f", cubo);
		keyboard.close();

	}

}
