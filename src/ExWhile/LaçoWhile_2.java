package ExWhile;
import java.util.Scanner;


// CODIGO PARA EXECUTAR SOME A MENSAGEM QUANDO O USUARIO DIGITAR O SEU NOME

public class LaçoWhile_2 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String name = "";
		
		
		while(name.isBlank()) {
			
			System.out.println("Digite seu nome: ");
			name = scanner.nextLine();
			
		}
		
		System.out.println("Hello " + name);
		
	}

}
