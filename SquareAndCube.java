package exercicios;

import java.util.Scanner;

/**
 * Feito por Ronyeri Marinho
 * 
 * 04 - Crie um programa que leia um n�mero e calcule seu quadrado e cubo.
 * 
 * */

public class SquareAndCube {

	public static void main(String[] args) {
		
		double numero, quadrado, cubo;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.printf("Digite um n�mero: ");
		numero = keyboard.nextDouble();
		
		quadrado = (numero * numero);
		cubo = ((numero * numero) * numero);
		
		System.out.printf("N�mero digitado: %.1f", numero);
		System.out.printf("\nN�mero ao quadrado: %.1f", quadrado);
		System.out.printf("\nN�mero ao cubo: %.1f", cubo);
		keyboard.close();

	}

}
