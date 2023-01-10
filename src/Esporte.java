/**
 * *@author ricardo.yoshio
 * Cadastro do tipo de evento da aposta
 */

public class Esporte {
	
	private String modalidade;

	public String getModalidade() {
		return modalidade;
	}

	public void setNome(String modalidade) {
		this.modalidade = modalidade;
	}
	
	public void cadastrarModalidade(String modalidade) {
		setNome(modalidade);
	}
	
	public void imprimirModalidade() {
		System.out.println(this.modalidade);
	}

}
