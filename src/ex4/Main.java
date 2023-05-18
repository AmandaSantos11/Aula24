package ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner digite = new Scanner(System.in);

        ContaCorrente conta = new ContaCorrente("Amanda", 30525, 0, 0);

        System.out.println("Saldo atual: " +conta.getSaldo());
        System.out.println("-------------------------------");
        System.out.println("Você deseja: ");
        System.out.println("1-Depositar na conta | 2-Sacar dinheiro");
        switch (digite.nextInt()){
            case 1:
                System.out.println("Deseja depositar quanto?");
                double valorDigitado = digite.nextDouble();
                conta.setSaldo(valorDigitado);
                conta.depositarNaConta();
                break;

            case 2:
                System.out.println("Deseja sacar quanto?");
                    valorDigitado = digite.nextDouble();
                    conta.sacarDinheiro(valorDigitado);
                break;

            default:
                System.out.println("Opção inválida");
                System.exit(0);
        }
        System.out.println("Saldo atual: " +conta.getSaldo());
    }
}