package ExerciciosDoModulo;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double valor=0;
		double contador=0; 
		
		while(valor>=0) {
			
			System.out.println("Digite um numero");
			contador+=valor;
			valor=entrada.nextDouble();
			
				
		}
		
		System.out.println("O total é: "+ contador);
		
		entrada.close();
		
	}

}
