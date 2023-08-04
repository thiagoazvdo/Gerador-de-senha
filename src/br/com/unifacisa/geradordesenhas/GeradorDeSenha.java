package br.com.unifacisa.geradordesenhas;
import java.util.Scanner;

public class GeradorDeSenha {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de números na senha: ");
        int quantidadeNumeros = scanner.nextInt();

        System.out.print("Digite a quantidade de letras na senha: ");
        int quantidadeLetras = scanner.nextInt();

        System.out.print("Digite a quantidade de caracteres especiais na senha: ");
        int quantidadeCaracteresEspeciais = scanner.nextInt();

        Senha novaSenha = new Senha(quantidadeNumeros, quantidadeLetras, quantidadeCaracteresEspeciais);

        System.out.println("Senha gerada: " + novaSenha.geraSenha().toString());

        scanner.close();
    }
}
