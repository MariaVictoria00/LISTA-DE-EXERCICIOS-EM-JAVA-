package ExerciciosDoModulo;

import java.util.Scanner;


/*   RGRAS PARA ANO BISSEXTO
De 4 em 4 anos é ano bissexto.
De 100 em 100 anos não é ano bissexto.
De 400 em 400 anos é ano bissexto.
Prevalecem as últimas regras sobre as primeiras*/

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


