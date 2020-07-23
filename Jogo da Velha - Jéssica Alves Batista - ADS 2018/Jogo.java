import java.util.Scanner;

public class Jogo {
	
	//Atributos
	Tabuleiro tabuleiro;
	Jogador jogador1;
	Jogador jogador2;
	
	
	//Construtor 
	
	public Jogo (Tabuleiro tabuleiro, Jogador jogador1, Jogador jogador2) {
		
		this.tabuleiro = tabuleiro;
		this.jogador1 = jogador1;
		this.jogador2 = jogador2;
	}
	

	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro ();
		Jogador jogador1 = new Jogador ("João", "X", 1);
		Jogador jogador2 = new Jogador ("Zezinho", "0", 2);
		String vencedor = new String();
		Scanner sc = new Scanner (System.in);
		int linha;
		int coluna;
		
		
		while ( vencedor != "Ganhou" || vencedor != "Empate") {
			
			if (jogador1.num == 1){
			
				tabuleiro.exibirTabuleiro();
				System.out.println("*** Jogador " + jogador1.nome + " ***");
				System.out.println("Insira a linha:");
				linha = sc.nextInt();
				System.out.println("Insira a coluna:");
				coluna = sc.nextInt();
			
				if ( tabuleiro.testaPosicao(linha, coluna) == true ) {
					tabuleiro.insereJogada(linha, coluna, jogador1.getSimbolo());
					vencedor = tabuleiro.testaFimJogo(jogador1.getSimbolo());
					jogador1.num = jogador1.num +1;
					
					if ( vencedor == "Ganhou" ) {
						System.out.println( "O Jogador " + jogador1.getNome() + " venceu !!!");
						tabuleiro.exibirTabuleiro();
						break;
					}
					
					if (vencedor == "Empate") {
						System.out.println( "O jogo ficou empatado");
						tabuleiro.exibirTabuleiro();
						break;
					}
				}
				else {
					System.out.println("Jogada não permitida");
				}
			}
						
			if (jogador1.num == 2){
				
				tabuleiro.exibirTabuleiro();
				System.out.println("*** Jogador " + jogador2.nome + " ***");
				System.out.println("Insira a linha:");
				linha = sc.nextInt();
				System.out.println("Insira a coluna:");
				coluna = sc.nextInt();
				
				if ( tabuleiro.testaPosicao(linha, coluna) == true ) {
					tabuleiro.insereJogada(linha, coluna, jogador2.getSimbolo());
					vencedor = tabuleiro.testaFimJogo(jogador2.getSimbolo());
					jogador1.num = jogador1.num -1;
					
					if ( vencedor == "Ganhou" ) {
						System.out.println( "O Jogador " + jogador2.getNome() + " venceu !!!");
						tabuleiro.exibirTabuleiro();
						break;
					}
					
					if (vencedor == "Empate") {
						System.out.println( "O jogo ficou empatado");
						tabuleiro.exibirTabuleiro();
						break;
					}
				}
				else {
					System.out.println("Jogada não permitida");
				}
			}
						
		}		
	}
}

