package exercicios;

import java.util.Scanner;

/**
 * Feito por Ronyeri Marinho
 * 
 * 01 - Crie um programa que leia a temperatura em Celsius e converta para Fahrenheit.
 * 
 * F�rmula: (0 �C * 9 / 5) + 32 = 32 �F
 * */

public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		
		double celsius, fahrenheit;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.printf("Digite a temperatura em Celsius que deseja converter: ");		
		celsius = keyboard.nextDouble();
		
		fahrenheit = (celsius * 9 / 5) + 32;
		System.out.printf("\nTEMPERATURA EM CELSIUS: %.1f �C", celsius);
		System.out.printf("\nTEMPERATURA EM FAHRENHEIT: %.1f �F", fahrenheit);
		
		keyboard.close();
	}

}
