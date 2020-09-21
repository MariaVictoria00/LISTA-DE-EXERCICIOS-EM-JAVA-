package ExerciciosDoModulo;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero;
		int numFixo=22;
		for(int i=10;i>=1;i--) {
		System.out.println("Digite um numero de 0 a 100");
		numero=entrada.nextInt();
		if(numero==numFixo) {
			System.out.println("ACERTOU");
			break;
		}
		else if(numero>numFixo) {
			System.out.println("ERROU!");
			System.out.println("Numero é menor que o valor fixo");
			System.out.println("Voce  tem: "+(i-1) + "chances");
		}
		else if(numero<numFixo) {
			System.out.println("ERROU!");
			System.out.println("Numero é maior que o valor fixo");
			System.out.println("Voce ainda tem: "+(i-1)+ " Chances");
		}
		
		
		}
		
		
		
		
		
		
		
		
		
		entrada.close();
	}

}
