package ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner digite = new Scanner(System.in);

        Bola bola1 = new Bola (68, "laranja", "futebol", "couro", 25.5);
        Bola bola2 = new Bola (40, "vermelho", "basquete", "couro", 70.5);

        System.out.println("Descrição da bola1: ");
        System.out.println("Cincunferência: "+bola1.getCircunferencia());
        System.out.println("Cor: " +bola1.getCor());
        System.out.println("Marca: " +bola1.getMarca());
        System.out.println("Material: " +bola1.getMaterial());
        System.out.println("Velocidade: " +bola1.getVelocidade());
        System.out.println("------------------------------------");
        System.out.println("Para qual cor deseja mudar a bola: ");
        bola1.setCor(digite.next());
        System.out.println("Cor atualizada: " +bola1.getCor());

        System.out.println("==================================");
        System.out.println("Descrição da bola2: ");
        System.out.println("Cincunferência: "+bola2.getCircunferencia());
        System.out.println("Cor: " +bola2.getCor());
        System.out.println("Marca: " +bola2.getMarca());
        System.out.println("Material: " +bola2.getMaterial());
        System.out.println("Velocidade: " +bola2.getVelocidade());
        System.out.println("------------------------------------");
        System.out.println("Para qual cor deseja mudar a bola: ");
        bola2.setCor(digite.next());
        System.out.println("Cor atualizada: " +bola2.getCor());
    }
}
