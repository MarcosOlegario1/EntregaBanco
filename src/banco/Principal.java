package banco;

import banco.ui.InterfaceModeloTexto;


public class Principal {

	public static void main(String[] args) {
		InterfaceModeloTexto interfaceTexto = new InterfaceModeloTexto() {
			@Override
			public void adicionar() {

			}

			@Override
			public void listarTodos() {

			}

			@Override
			public void editar() {

			}

			@Override
			public void excluir() {

			}
		};
		
		System.out.println("Sobre o Livro");

		interfaceTexto.executa();

	}
	
}
