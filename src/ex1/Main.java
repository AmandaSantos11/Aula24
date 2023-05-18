package ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner digite = new Scanner(System.in);

        Caixa caixa = new Caixa(1000.0, 0, 0);

        System.out.println("Você tem " + caixa.getSaldo() +" de saldo");

        System.out.println("Digite quantos lançamentos deseja fazer: ");
        int qtdDigitada = digite.nextInt();

        for (int i = 0; i < qtdDigitada; i++) {
            System.out.println("Informe um valor: ");
            double valorDigitado = digite.nextDouble();

            System.out.println("Digite a opção que deseja: ");
            System.out.println("1- Crédito | 2- Débito");
            switch (digite.nextInt()){
                case 1:
                    caixa.setCredito(valorDigitado);
                    caixa.funcaoCredito();
                    break;

                case 2:
                    caixa.setDebito(valorDigitado);
                    caixa.funcaoDebito();
                    break;

                default:
                    System.out.println("Opção inválida");
                    System.exit(0);
            }
            System.out.println("Saldo atual: " + caixa.getSaldo());
        }
    }
}