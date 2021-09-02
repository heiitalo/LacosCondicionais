package br.com.lacosdecisao;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    int num1 = 0, num2 = 0, num3 = 0, auxi = 0;
    
    System.out.println("Digite um Número: ");
    num1 = entrada.nextInt();
    
    System.out.println("Digite um Número: ");
    num2 = entrada.nextInt();
    
    System.out.println("Digite um Número: ");
    num3 = entrada.nextInt();
    
    if(num1 > num2){
    	
    auxi = num1;
    num1 = num2;
    num2 = auxi;
    
    }
    if(num2 > num3) {
    auxi = num2;
    num2 = num3;
    num3 = auxi;
    
    }
    if(num1 > num2){
    	
        auxi = num1;
        num1 = num2;
        num2 = auxi;
        
        }
    System.out.println("1ºvalor: " + num1 + " 2ºvalor: " + num2 + " 3ºvalor: "+ num3 );
    
    entrada.close();
    
	}
    }
 




