package exercicios;

import java.util.Scanner;

/**
 * Feito por Ronyeri Marinho
 * 
 * 01 - Crie um programa que leia a temperatura em Celsius e converta para Fahrenheit.
 * 
 * Fórmula: (0 ºC * 9 / 5) + 32 = 32 ºF
 * */

public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		
		double celsius, fahrenheit;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.printf("Digite a temperatura em Celsius que deseja converter: ");		
		celsius = keyboard.nextDouble();
		
		fahrenheit = (celsius * 9 / 5) + 32;
		System.out.printf("\nTEMPERATURA EM CELSIUS: %.1f ºC", celsius);
		System.out.printf("\nTEMPERATURA EM FAHRENHEIT: %.1f ºF", fahrenheit);
		
		keyboard.close();
	}

}
