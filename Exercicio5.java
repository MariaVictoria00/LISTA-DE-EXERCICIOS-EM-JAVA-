package ExerciciosDoModulo;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("DIGITE UM NUMERO!");
		int numero= entrada.nextInt();
		
		int contador=0;
		
		
		
		for(int i=1;i<numero;i++) {
     		if(numero%i==0) {
     			contador++;
		    }
		}
		
		
		
		if(numero!=1) {
		switch (contador){
		case 0:
			System.out.println("é numero primo");
			break;
		
		default :
			System.out.println("Não é numero primo");
			
		}
		}
		else {
			System.out.println("Não é numero primo");
			
		}
		
		
		entrada.close();
		}
			
	
	}

