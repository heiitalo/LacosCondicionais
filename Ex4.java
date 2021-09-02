package br.com.lacosdecisao;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	double numero = 0.0;
	
	System.out.println("Escreva um número: ");
	numero = entrada.nextDouble();
	
	if(numero % 2 == 0) {
		System.out.println(numero + " É um número par. ");
	}
	else {
		System.out.println(numero + " É um número impar");
	}
    if(numero % 2 == 0) {
    	numero = Math.sqrt(numero);
    	System.out.println("A raiz quadrado do número é: " + numero);
    }
    else {
    	numero = Math.pow(numero, 2.0);
    	System.out.println("O número elevado ao quadrada é: " + numero);
    }
    entrada.close();
	}
	}


