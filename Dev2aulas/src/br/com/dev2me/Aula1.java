package br.com.dev2me;

import javax.swing.JOptionPane;

public class Aula1 {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Meu nome é: ");

		  int n1 = Integer.valueOf(JOptionPane.showInputDialog("Digite o valor da matricula: "));
		  int n2 = Integer.valueOf(JOptionPane.showInputDialog("Digite o valor da primeira parcela: "));
		  
		 int soma = 0;
		

		soma = n1 + n2;
		
		System.out.println("Para o estudante: " + nome);
		System.out.println("O valor desse mês: " + soma);
		

	}
}
