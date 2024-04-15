package Exemplos_logicAlg;
import java.util.Scanner;

public class ifElseJava {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println ("Entre com sua idade");
		
		int idade = scan.nextInt();
		
		
		if(idade >= 18) {
			
			System.out.println( " é maior de idade");
			
		} else {
			
			System.out.println("Não é maior de idade");
					
			
		}
		
		
		
		
	}

}
