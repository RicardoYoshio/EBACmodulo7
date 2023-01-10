/**
 * *@author ricardo.yoshio
 * Cadastro do especialista em aposta, responsável pela informação
 */

public class Tipster {
	
	private String nome;
	
	private String grupo;
	
	private int id;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void cadastrarNome(String nome) {
		setNome(nome);
	}
	
	public void imprimirNome() {
		System.out.println(this.nome);
	}
}



