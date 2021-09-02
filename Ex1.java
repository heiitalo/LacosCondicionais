package br.com.lacosdecisao;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0, maiorNumero = 0;
		
		for(int i = 0; i < 3; i++ ) {
		System.out.println("Digite o número: ");	
		numero = entrada.nextInt();
		
		if(numero > maiorNumero) {
		maiorNumero = numero;
		
		}
		}
		System.out.println("O maior número é: " + maiorNumero);
		
	entrada.close();
 }
	
}


