import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {
		
		String frase;
		char[] alfabeto = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 
				'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'X', 'Z', 'Y', 'W'};
		
		int[] ocorrencias = new int[alfabeto.length];
		
		int posicao = 0;
		
		Scanner input = new Scanner(System.in);	
		
		System.out.println("Insira uma frase:");
		frase = input.nextLine();
		frase = frase.toUpperCase();
		
		for(int i = 0; i < alfabeto.length; i++) {
			
			posicao = 0;
			
			while(frase.indexOf(alfabeto[i], posicao) >= 0) {
				
				ocorrencias[i]++;
				posicao = frase.indexOf(alfabeto[i], posicao) + 1;
					
			}
			
		}
		
		System.out.println("Resultado:");
		
		System.out.printf("Letra\tOcorrências na frase%n");
		
		for(int i = 0; i < alfabeto.length; i++) {
			
			System.out.printf("%c\t%d%n", alfabeto[i], ocorrencias[i]);
			
		}
		
		
		
	}

}

