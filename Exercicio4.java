package ExerciciosDoModulo;

import java.util.Scanner;

public class Exercicio4 {
	 public static void main(String[] args) {
		 
		 /* REGRA DO NUMERO PRIMO 
		  possuem somente dois divisores, ou seja, são divisíveis por 1 e por ele mesmo.(exceto o um)
		 */
		 
		 
		Scanner entrada = new Scanner(System.in);
		System.out.println("DIGITE UM NUMERO");
		double numero=entrada.nextDouble();
		int contador=0;
		for(int i=2;i<numero;i++) {
     		if(numero%i==0) {
     			contador++;
		    }
		}
		if(numero!=1 &&contador==0) {
			System.out.println("è um numero primo");
		}
		else {
			System.out.println("Não é um numero primo");
		}
		
		
		entrada.close();
	}

}
