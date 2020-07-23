
public class Jogador {
	
	// Atributos
	String simbolo;
	String nome;
	int num;
	
	
	//Construtores
	public Jogador () {
		
	}
	public Jogador (String nome, String simbolo, int num) {
		this.nome = nome;
		this.simbolo = simbolo;
		this.num = num;
	}
	
	// Métodos
	
	public String getSimbolo() {
		return simbolo;
	}
	
	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Jogador [simbolo=" + simbolo + ", nome=" + nome + "]";
	}
	

}

