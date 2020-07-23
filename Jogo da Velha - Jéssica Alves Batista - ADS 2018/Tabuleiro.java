
public class Tabuleiro {
	
	//Atributos
	String [] [] tabuleiro;
	int linhas;
	int colunas;
	int contador = 0;
	
	//Construtor 
	public Tabuleiro () {
		tabuleiro = new String [3][3];
		this.linhas = 3;
		this.colunas = 3;
		
	}
	
	
	public Tabuleiro (int linhas, int colunas) {
		tabuleiro = new String [linhas] [colunas];
		this.linhas = linhas;
		this.colunas = colunas;
	}

	// Métodos
	public int getLinhas () {
		return linhas;
	}
	
	public int getColunas () {
		return colunas;		
	}
	
	public void setLinhas (int linhas) {
		this.linhas = linhas;
	}
	
	public void setColunas (int colunas) {
		this.colunas = colunas;
	}
	
	
	public void exibirTabuleiro () {
		
		System.out.println(" -------- TABULEIRO   ---------");
		
		for (int i=0; i<=2; i++) {
			
			
			for (int j= 0; j<=2; j++) {
				
				System.out.print("   " + tabuleiro [i][j] + "   ");				
			}
			System.out.println();
		}
		
		
		System.out.println(" ------------------------------");
	
	}
	
	
	
	public boolean testaPosicao (int linha, int coluna) {
		if (linha>2 || coluna>2) {
			return false;
		}else{
			if (tabuleiro[linha][coluna] == null) {
				return true;
			}
			return false;
		}
	}
	
	public void insereJogada(int linha, int coluna, String simbolo) {
		tabuleiro [linha][coluna] = simbolo;		
	}


	public String[][] getTabuleiro() {
		return tabuleiro;
	}


	public void setTabuleiro(String[][] tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

	
	public String testaFimJogo ( String simbolo ) {
		
		contador++;
		
		for (int i=0; i<=2; i++) {			
			
			//Testa linhas
			if ( tabuleiro[i][0] == simbolo &&  tabuleiro[i][1] == simbolo && tabuleiro[i][2] == simbolo) {
				return "Ganhou";
			}						
			
			
			//Testa colunas
			if ( tabuleiro[0][i] == simbolo &&  tabuleiro[1][i] == simbolo && tabuleiro[2][i] == simbolo) {
				return "Ganhou";
			}						
			
		}
		
		//Testa Diagonal Principal
		if ( tabuleiro[0][0] == simbolo &&  tabuleiro[1][1] == simbolo && tabuleiro[2][2] == simbolo) {
			return "Ganhou";
		}						
		
		
		//Testa Diagonal Secundária
		if ( tabuleiro[2][0] == simbolo &&  tabuleiro[1][1] == simbolo && tabuleiro[0][2] == simbolo) {
			return "Ganhou";
		}						
		
	
		if (contador >= 9) {
			return "Empate";
		}		
		
		return "";
	}
	
		
}
