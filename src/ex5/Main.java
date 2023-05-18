package ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner digite = new Scanner(System.in);
        Carro carro = new Carro(2,"Kei car","Honda",5.0);

        System.out.println("Descrição do carro");
        System.out.println("Quantidade de porta: " +carro.getQntdDePortas());
        System.out.println("Modelo: " +carro.getModelo());
        System.out.println("Marca: " +carro.getMarca());
        System.out.println("Potência: " +carro.getPotencia());
        System.out.println("======================");

        System.out.println("Deseja ligar o carro?");
        System.out.println("1-Sim | 2-Não");
        switch (digite.nextInt()){
            case 1:
                carro.ligarCarro();
                break;

            case 2:
                System.exit(0);
                break;

            default:
                System.out.println("Opção inválida");
        }
    }
}