package banco.ui;

import banco.modelo.Imprimivel;

import java.util.List;
import java.util.Scanner;

abstract public class InterfaceModeloTexto {
	abstract public void adicionar();
	abstract public void listarTodos();
	abstract public void editar();
	abstract public void excluir();
	protected Scanner entrada;
	
	public InterfaceModeloTexto() {
		entrada = new Scanner(System.in);
	}
	
	protected void imprimeItem(Imprimivel imprimivel) {
		System.out.println(imprimivel.imprimeEmLista());
	}
	
	protected void imprimeLista(List<Imprimivel> imprimiveis, String[] colunas) {
		for (String coluna : colunas) {
			System.out.println(coluna + "\t");
		}
		System.out.println();
		
		for (Imprimivel item : imprimiveis) {
			imprimeItem(item);
		}
	}

	public void executa() {
	}
}
