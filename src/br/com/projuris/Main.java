package br.com.projuris;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		
		/*Demonstração:
			“stress” – deve retornar “t”. “reembolsar” –
			deve retornar “m”.
		 */
		
		Scanner sc = new Scanner(System.in);

		// entrada da palavra na qual será realizado a verificação
		System.out.println("Informe a palavra para verificação.");
		String palavra = sc.next();
		
		MyFindChar myfind= new MyFindChar();
		
		// mostra uma mensagem falando a primeira letra não repetida concatenado com a letra
		System.out.println("A primeira letra não repetida foi a letra : "+myfind.findChar(palavra));
		
		
		sc.close();
	}
	
	

}
