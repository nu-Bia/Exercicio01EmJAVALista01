//1) Escreva um algoritmo para ler um valor do teclado e exibir como resposta o número sucessor.

import java.util.Scanner;

public class Exercicio01 {
	
public static void main (String[]args) {

System.out.println("Digite um valor para consultar o seu sucessor");
	 
Scanner sc = new Scanner(System.in);
	 
int valor=sc.nextInt();

System.out.println(valor+1);

sc.close();
	 
}}
