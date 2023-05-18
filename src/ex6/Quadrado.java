package ex6;
public class Quadrado {
    private double ladoA;
    public Quadrado(double ladoA){
        this.ladoA = ladoA;
    }
    public double getLadoA() {
        return ladoA;
    }
    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }
    public double calcularArea(){
        return ladoA*ladoA;

    }
}