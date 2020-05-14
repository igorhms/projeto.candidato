package application;

import java.util.Locale;
import java.util.Scanner;

public class simula {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int resposta, experiencia, pontoEscolaridade, pontoExperiencia;
		String viajar, habilitacao;

		System.out.println("Qual sua escolaridade?");
		System.out.println("Ensino Fundamental");
		System.out.println("Ensino Médio");
		System.out.println("Ensino Superior");
		System.out.println("Pós-graduação");
		System.out.print("Digite uma opção: ");
		resposta = sc.nextInt();
		
		System.out.println();
		System.out.print("Você tem quantos anos de experência profissional?");
		experiencia = sc.nextInt();
		System.out.print("Você tem disponibilidade para viajar (S/N)?");
		viajar = sc.next();
		System.out.print("Você tem habilitação de motorista (S/N)?");
		habilitacao = sc.next();
		System.out.println();
		
		if (resposta == 1){
			pontoEscolaridade = 10;
		}
		else if (resposta == 2) {
				pontoEscolaridade = 20;
		}
		else if (resposta == 3){
				pontoEscolaridade = 30;
		}
		else {
			pontoEscolaridade = 40;
		}
		System.out.printf("Pontos por escolaridade: %d%n", pontoEscolaridade);
		
		if (experiencia == 0){
			pontoExperiencia = 0;
		}
		else if (experiencia < 2){
			pontoExperiencia = 10;
		}
		else if (experiencia > 2 && experiencia < 5){
			pontoExperiencia = 20;
		}
		else {
			pontoExperiencia = 40;
		}
		System.out.printf("Pontos por experiência: %d%n", pontoExperiencia);
		System.out.println();
		
		System.out.println("Você está habilitado para o(s) seguinte(s) cargo(s):");		
		if (pontoExperiencia >= 40 && pontoEscolaridade >= 30 && viajar.contains("S")){
			System.out.println("GERENTE");
			System.out.println("ANALISTA");
		}
		else if (pontoExperiencia >= 20 && pontoEscolaridade >= 30 && habilitacao.contains("S") && viajar.contains("N")){
			System.out.println("ASSISTENTE");
			System.out.println("GERENTE");
		}	
		else if (pontoExperiencia >= 20 && pontoEscolaridade >= 30 && viajar.contains("N") && habilitacao.contains("N")){
			System.out.println("GERENTE");
		}
		else if (pontoEscolaridade >= 20 && habilitacao.contains("S")){
			System.out.println("ASSISTENTE");	
		}
		else {
			System.out.println("Infelizmente seu perfil não atente a empresa");
		}
		
		
		sc.close();
	}

}
