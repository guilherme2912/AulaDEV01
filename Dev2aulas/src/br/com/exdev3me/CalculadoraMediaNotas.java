package br.com.exdev3me;


import java.util.ArrayList;

import javax.swing.JOptionPane;

public class CalculadoraMediaNotas {

	public static void main(String[] args) {
		ArrayList<String> novosAlunos = new ArrayList<>();
		Alunos alunos = new Alunos();
		
		int opcao = 0;
		
		do {
			opcao = Integer.valueOf(JOptionPane.showInputDialog("Digite [1] para nota de um novo aluno \n Digite [2] Para finalizar as notas: "));
			
			if(opcao == 1) {
				
				novosAlunos.add(alunos.nomeAluno);
				
				alunos.nomeAluno = JOptionPane.showInputDialog("Digite o nome do Aluno: ");
				alunos.n1 = Integer.valueOf(JOptionPane.showInputDialog("Digite o valor da primeira nota: "));
				alunos.n2 = Integer.valueOf(JOptionPane.showInputDialog("Digite o valor da segunda nota: "));
				alunos.n3 = Integer.valueOf(JOptionPane.showInputDialog("Digite o valor da terceira nota: "));	
								
			} else  {
				System.out.println("Opção Invalida!!!");
			 
			}
			
			
			
		} while (opcao != 2);
		
		
			
		
		System.out.println("Nota do Aluno " + alunos.nomeAluno + " - " + calcularMedia(alunos.n1, alunos.n2, alunos.n3));
		
		
		
		
	}

	public static int calcularMedia(int n1, int n2, int n3) {
		int media = (n1 + n2 + n3) / 3;
		
		return media;
	}
	
}
