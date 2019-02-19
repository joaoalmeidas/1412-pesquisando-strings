import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {
		
		String frase;
		char caractere;
		int quantidade = 0;
		int posicao = 0;
		
		Scanner input = new Scanner(System.in);	
		
		System.out.println("Insira uma frase:");
		frase = input.nextLine();
		
		System.out.println("Insira um caractere para pesquisar na frase:");
		caractere = input.next().charAt(0);
		
		while(frase.indexOf(caractere, posicao) >= 0) {
			
			quantidade++;
			posicao = frase.indexOf(caractere, posicao) + 1;
				
		}
		
		System.out.printf("Ocorrências de \'%c\' em \"%s\": %d", caractere, frase, quantidade);
		
	}

}
