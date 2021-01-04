package exercicios;

import java.util.Scanner;

/**
 * Feito por Ronyeri Marinho
 * 
 * 03 - Crie um programa que leia o peso e altura do usuário e imprima seu IMC.
 * 
 * Fórmula: IMC = Peso / Altura²
 * */

public class CalculatingIMC {

	public static void main(String[] args) {
		
		double peso, altura, imc;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.printf("Digite o peso da pessoa: ");
		peso = keyboard.nextDouble();
		System.out.printf("\nDigite agora a altura: ");
		altura = keyboard.nextDouble();
		
		imc = (peso / (altura * altura));
		
		System.out.printf("\nO IMC da pessoa: %.2f", imc);
		
		keyboard.close();
	}

}
