package br.com.unifacisa.geradordesenhas;

import java.util.Random;

public class Senha {

	StringBuilder senha = new StringBuilder();

	private int qtdNumeros;

	private int qtdLetras;

	private int qtdEspeciais;
	
	public Senha(int qtdNumeros, int qtdLetras, int qtdEspeciais) {
		this.qtdNumeros = qtdNumeros;
		this.qtdLetras = qtdLetras;
		this.qtdEspeciais = qtdEspeciais;
	}

	public void setQtdNumeros(int qtdNumeros) {
		this.qtdNumeros = qtdNumeros;
	}

	public void setQtdLetras(int qtdLetras) {
		this.qtdLetras = qtdLetras;
	}

	public void setQtdEspeciais(int qtdEspeciais) {
		this.qtdEspeciais = qtdEspeciais;
	}

	public static String alfabeto = "a b c d e f g h i j k l m n o p q r s t u v x z y";

	public static String numeros = "0 1 2 3 4 5 6 7 8 9";

	public static String caracteres = "- * / @ # $ % & ( ) = _ ' ";

	String[] arrayLetras = alfabeto.split(" ");

	String[] arrayNumeros = numeros.split(" ");

	String[] arrayCaracteres = caracteres.split(" ");

	public StringBuilder defineNumeros(int qtdNumeros) {
		for (int i = 0; i < qtdNumeros; i++) {
			Random generator = new Random();
			int randomIndex = generator.nextInt(arrayNumeros.length);
			senha.append(arrayNumeros[randomIndex]);
		}
		return senha;
	}

	public StringBuilder defineLetras(int qtdLetras) {
		for (int i = 0; i < qtdLetras; i++) {
			Random generator = new Random();
			boolean upperOrLowerCase = generator.nextBoolean();
			if (upperOrLowerCase == true) {
				int randomIndex = generator.nextInt(arrayLetras.length);
				senha.append(arrayLetras[randomIndex].toUpperCase());
			} else {
				int randomIndex = generator.nextInt(arrayLetras.length);
				senha.append(arrayLetras[randomIndex]);
			}
		}
		return senha;
	}

	public StringBuilder defineCaracteres(int qtdEspeciais) {
		for (int i = 0; i < qtdEspeciais; i++) {
			Random generator = new Random();
			int randomIndex = generator.nextInt(arrayCaracteres.length);
			senha.append(arrayCaracteres[randomIndex]);
		}
		return senha;
	}
	
	public String geraSenha() {
		defineNumeros(qtdNumeros);
		defineLetras(qtdLetras);
		defineCaracteres(qtdEspeciais);
		return senha.toString();
	}

}
