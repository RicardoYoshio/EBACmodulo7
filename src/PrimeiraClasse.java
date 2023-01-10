/**
 * *@author ricardo.yoshio
 */

public class PrimeiraClasse {
	
	public static void main(String args[]) {
		System.out.println("Olá Ricardo");
		Tipster tipster = new Tipster();
		tipster.cadastrarNome("Pablo");
		tipster.setId(1);
		System.out.println(tipster.getId());
		tipster.imprimirNome();
		Esporte esporte = new Esporte();
		esporte.cadastrarModalidade("Futebol");
		esporte.imprimirModalidade();
		Unidade unidade = new Unidade();
		unidade.cadastrarUnidade(2.10);
		unidade.imprimirUnidade();
				
	}
	
}