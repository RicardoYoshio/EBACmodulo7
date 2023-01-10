/**
 * *@author ricardo.yoshio
 * Informação da Unidade Apostada
 */
public class Unidade {
	
	private double unidade;

	public double getUnidade() {
		return unidade;
	}

	public void setUnidade(double unidade) {
		this.unidade = unidade;
	}
	
	public void cadastrarUnidade(double unidade) {
		setUnidade(unidade);
	}
	
	public void imprimirUnidade() {
		System.out.println(this.unidade);
	}

}
