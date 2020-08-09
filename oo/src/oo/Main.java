package oo;

public class Main {

	private String nome = "teste";
	private int[] numeros;
	public static final int VIDA_MAXIMA = 100;
	
	//método construtor
	public Main() {
		System.out.println("Classe criada");
		System.out.println(this.nome);
		numeros = new int[100];
	}
	
	public String getNome() {
		return nome;
	}
	public static void main(String[] args) {
		new Main();
		Main m = new Main();
		System.out.println(m.getNome());
		System.out.println(Main.VIDA_MAXIMA);
		
	}

}
