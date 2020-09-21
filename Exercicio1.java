package ExerciciosDoModulo;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um valor");
		int valor = entrada.nextInt();
		
		
		if(valor>=0 &&valor<=10&& valor%2==0) {
			System.out.println("O numero faz parte do intervalo de 0 a Dez e é par");
		}
		else if(valor>=0 &&valor<=10&& valor%2==1) {
			System.out.println("O numero faz parte do intervalo de 0 a Dez e é impar");
		}
		
		else {
			System.out.println("Nao faz parte");
		}
		
	}

}
