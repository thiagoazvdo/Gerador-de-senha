package br.com.unifacisa.geradordesenhas;

public class GeradorDeSenha {

	public static void main(String[] args) {
		
		Senha novaSenha = new Senha(2, 5, 1);		
		
		System.out.println(novaSenha.geraSenha());

	}

}
