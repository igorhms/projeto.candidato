package application;

import java.util.Locale;
import java.util.Scanner;

public class simula {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int resposta;

		System.out.println("Qual sua escolaridade?");
		System.out.println("Ensino Fundamental");
		System.out.println("Ensino Médio");
		System.out.println("Ensino Superior");
		System.out.println("Pós-graduação");
		System.out.print("Digite uma opção: ");
		resposta = sc.nextInt();
		
		sc.close();
	}

}
