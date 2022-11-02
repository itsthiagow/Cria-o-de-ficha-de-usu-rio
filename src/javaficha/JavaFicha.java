package javaficha;

import java.io.IOException;
import java.util.Scanner;

public class JavaFicha {
	private static String nome;
	private static int idade;
	private static float altura;
	private static float peso;
	private static char genero;

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);

		do {
			System.out.println("Digite seu nome:");
			nome = leitura.nextLine();
		} while (nome.length() < 5 || nome.length() > 30);

		do {
			System.out.println("Digite sua idade:");
			idade = leitura.nextInt();
		} while (idade <= 0 || idade >= 100);

		do {
			System.out.println("Digite sua altura:");
			altura = leitura.nextFloat();
		} while (altura <= 0);

		do {
			System.out.println("Digite seu peso:");
			peso = leitura.nextFloat();
		} while (peso <= 0);

		do {
			System.out.println("Digite seu gênero: F ou M:");
			try {
				genero = (char) System.in.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while (genero != 'F' && genero != 'M');

		System.out.println("\nNome: " + nome);
		System.out.println("\nIdade: " + idade);
		System.out.println("\nAltura: " + altura);
		System.out.println("\nPeso: " + peso);
		System.out.println("\nGenero: " + genero);

	}

}
