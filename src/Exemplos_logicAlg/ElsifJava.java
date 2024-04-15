package Exemplos_logicAlg;
import java.util.Scanner;


public class ElsifJava {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" entre com o preço do item");
		
		double valor = scan.nextDouble();
		
		if ( valor <= 10 ) {
			
			System.out.println ("Está barato, pode comprar");
			
		} else if (valor < 10 && valor < 10) {
			
			System.out.println("Você pode pedir um desconto");
			
		} else if(valor >= 15  && valor < 17) {
			
			System.out.println("Pode pesquisar mais");
		} else {
			System.out.println("Esta muito caro");
		}
			
		
		
		
		
		
		
		
		
		
		
	}

}
