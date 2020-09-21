package ExerciciosDoModulo;

import java.util.Scanner;


//
//Anos divisíveis pelo número 4 são considerados bissextos.
//
//Anos divisíveis por 100 não são bissextos.
//
//Anos divisíveis por 400 são bissextos.
public class Exercicio2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o ano: ");
		int ano = entrada.nextInt();

		int bissexto = ano % 4;

		if (ano % 4 == 0 && ((ano % 100) > 0  || ano % 400 == 0)) {
			System.out.println(ano + " é um ano bissexto");
		} else {
			System.out.println(ano + " não é um ano bissexto");
		}
		entrada.close();
	}
		
	}


