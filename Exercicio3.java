package ExerciciosDoModulo;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		 
		double resultado;
		
		System.out.println("Digite a primeira nota:");
		double nota1= entrada.nextDouble();
		
		System.out.println("Digite a segunda nota:");
		double nota2= entrada.nextDouble();
		
		resultado=(nota1+nota2)/2;
		if(resultado>=7) {
			System.out.println("APROVADO!!");
		}
		
		else if(resultado<7 && resultado>=4) {
			System.out.println("RECUPERAÇÃO!!");
		}
		else {
			System.out.println("Reprovado :(");
		}
		
		
	}

}
