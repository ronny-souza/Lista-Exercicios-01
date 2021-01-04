package exercicios;

import java.util.Scanner;

/**
 * Feito por Ronyeri Marinho
 * 
 * 02 - Crie um programa que leia a temperatura em Fahrenheit e converta para Celsius.
 * 
 * F�rmula: (32 �F - 32) * 5 / 9 = 0 �C
 * */

public class FahrenheitToCelsius {

	public static void main(String[] args) {

		double fahrenheit, celsius;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.printf("Digite a temperatura em Fahrenheit para que seja realizada a convers�o para Celsius: ");
		fahrenheit = keyboard.nextDouble();
		
		celsius = (fahrenheit - 32) * 9/5;
		
		System.out.printf("\nTEMPERATURA EM FAHRENHEIT: %.1f", fahrenheit);
		System.out.printf("\nTEMPERATURA EM CELSIUS: %.1f", celsius);
		keyboard.close();
	}

}
