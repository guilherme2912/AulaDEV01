package br.com.exdev2me;

import javax.swing.JOptionPane;

public class UrnaEletronica {

	public static void main(String[] args) {
		Candidatos candidato = new Candidatos();
		Impressao impressao = new Impressao();
		Votos votos = new Votos();

				
		do {
			votos.operacaoMesario = Integer.valueOf(JOptionPane.showInputDialog("Digite a opção: \n" + impressao.iniciaEleicao + impressao.encerraEleicao));
			
			if (votos.operacaoMesario == 1) {
				votos.operacaoVoto = Integer.valueOf(JOptionPane.showInputDialog("   ------Candidatos----- \n" + candidato.candidato1 + candidato.candidato2 + candidato.candidato3 + candidato.candidato4 + candidato.candidato5));
				if (votos.operacaoVoto == 1) {
					votos.totalVotoAngela++;
				} else if (votos.operacaoVoto == 2) {
					votos.totalVotoGean++;
				} else if (votos.operacaoVoto == 3) {
					votos.totalVotoGean++;
				} else if (votos.operacaoVoto == 4) {
					votos.totalVotoNulo++;
				} else if (votos.operacaoVoto == 5) {
					votos.totalVotoBranco++;
				} else {
					impressao.imprimirEmTela();
				}
				
					}
			else if (votos.operacaoMesario == 2) {
				System.out.println("VOTAÇÃO ENCERRADA");
			}
			else {
				impressao.imprimirEmTela();
			}
			
			
		} while (votos.operacaoMesario != 2);
		
		// Contagem dos votos.

		System.out.println("TOTAL DE VOTOS: " + (votos.totalVotoAngela+votos.totalVotoGean+votos.totalVotoCesar+votos.totalVotoNulo+votos.totalVotoBranco));
		
		System.out.println("Total de votos para ANGELA : " + votos.totalVotoAngela);
		System.out.println("Total de votos para GEAN : " + votos.totalVotoGean);
		System.out.println("Total de votos para CESAR : " + votos.totalVotoCesar);
		System.out.println("Total de votos para NULO : " + votos.totalVotoNulo);
		System.out.println("Total de votos para BRANCO : " + votos.totalVotoBranco);
		
	}

}
