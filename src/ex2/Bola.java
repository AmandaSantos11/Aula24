package ex2;
public class Bola {
    private double circunferencia;
    private String cor;
    private String marca;
    private String material;
    private double velocidade;

    public Bola (double circunferencia,String cor,String marca,String material,double velocidade){
        this.circunferencia = circunferencia;
        this.cor = cor;
        this.marca = marca;
        this.material = material;
        this.velocidade = velocidade;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public double getCircunferencia() {
        return circunferencia;
    }
    public String getMarca() {
        return marca;
    }
    public String getMaterial() {
        return material;
    }
    public double getVelocidade() {
        return velocidade;
    }
}
