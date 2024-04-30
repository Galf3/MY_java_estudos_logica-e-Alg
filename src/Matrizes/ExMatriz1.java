package Matrizes;

public class ExMatriz1 {
	
	
	public static void main(String[] args) {
		
		double [][] notasAlunos = new double [30][4]; // instanciou uma matriz tabela de 30 alunos e 4 notas
		
		notasAlunos [0][0]= 10;
		notasAlunos [0][1]= 7;
		notasAlunos [0][2]= 9;
		notasAlunos [0][3]= 5;
		
		notasAlunos [1][0]= 9;
		notasAlunos [1][1]= 7;
		notasAlunos [1][2]= 9.8;
		notasAlunos [1][3]= 5.8;
		
		notasAlunos [2][0]= 7;
		notasAlunos [2][1]= 7;
		notasAlunos [2][2]= 8;
		notasAlunos [2][3]= 9.5;
		
		for (int i=0; i< notasAlunos.length; i++) {
			
			for (int j = 0; j< notasAlunos[i].length; j++) {
				
				System.out.print(notasAlunos[i][j] + "- ");
				
			}
			
			System.out.println();
		}
		
		System.out.println ("Calculando a média de cada aluno");
		double soma;
		for (int i = 0; i<notasAlunos.length; i++) {
			
			soma = 0;
			
			for (int j=0; j<notasAlunos[i].length; j++) {
				
				soma += notasAlunos[i][j];
			}
			System.out.println("média do aluno" + i + " é = " + (soma/4));
		}
			
	}

}
