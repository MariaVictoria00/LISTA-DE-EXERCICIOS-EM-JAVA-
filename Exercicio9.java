package ExerciciosDoModulo;

import java.util.Scanner;

public class Exercicio9 {
	
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			int valor;
			double auxiliar=0;
			for(int i=0;i<10;i++) {
				System.out.println("Digite um numero");
				valor=entrada.nextInt();	
				if(valor>auxiliar) {
					auxiliar=valor;
				}
			

				
			}
			System.out.println("O maior valor e: "+auxiliar);
			
		
	}

}
