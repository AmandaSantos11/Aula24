package ex6;

public class Main {
    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado(4.5);

        System.out.println("Quadrado inicial: " +quadrado.getLadoA());
        System.out.println("A área do quadrado é: " +quadrado.calcularArea());
        System.out.println("-------------------------------------------------");

        quadrado.setLadoA(6);
        System.out.println("Lado do quadrado alterado para: " +quadrado.getLadoA());
        System.out.println("A área do quadrado é: " +quadrado.calcularArea());
    }
}
