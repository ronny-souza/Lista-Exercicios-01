package exercicios;

import java.util.Scanner;

/**
 * Feito por Ronyeri Marinho
 * 
 * 05 - Crie um programa que leia o valor da base e altura de um tri�ngulo e calcule sua �rea.
 * 
 * F�RMULA: Base * Altura / 2
 * */

public class TriangleArea {

	public static void main(String[] args) {
		
		double base, altura, areaTriangulo;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.printf("Digite o valor da base: ");
		base = keyboard.nextDouble();
		System.out.printf("Digite o valor da altura: ");
		altura = keyboard.nextDouble();
		
		areaTriangulo = ((base * altura) / 2); 
		
		System.out.printf("\nO valor da �rea do tri�ngulo �: %.1f", areaTriangulo);
		keyboard.close();

	}

}
