package br.com.projuris;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		
		/*Demonstra��o:
			�stress� � deve retornar �t�. �reembolsar� �
			deve retornar �m�.
		 */
		
		Scanner sc = new Scanner(System.in);

		// entrada da palavra na qual ser� realizado a verifica��o
		System.out.println("Informe a palavra para verifica��o.");
		String palavra = sc.next();
		
		MyFindChar myfind= new MyFindChar();
		
		// mostra uma mensagem falando a primeira letra n�o repetida concatenado com a letra
		System.out.println("A primeira letra n�o repetida foi a letra : "+myfind.findChar(palavra));
		
		
		sc.close();
	}
	
	

}
