package br.com.dio;

public class PrimeiroPrograma {

	public static void main(String[] args) {

		Gato gato = new Gato();
		Livro livro = new Livro();

		System.out.println(gato);
		System.out.println(livro);
	}

}

class Livro {
	private String nome;
	private String npag;

}
