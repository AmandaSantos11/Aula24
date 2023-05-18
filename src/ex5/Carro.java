package ex5;
public class Carro {
    private int qntdDePortas;
    private String modelo;
    private String marca;
    private double potencia;
    public Carro(int qntdDePortas,String modelo,String marca,double potencia){
        this.qntdDePortas = qntdDePortas;
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = potencia;
    }
    public int getQntdDePortas() {
        return qntdDePortas;
    }
    public String getModelo() {
        return modelo;
    }
    public String getMarca() {
        return marca;
    }
    public double getPotencia() {
        return potencia;
    }
    public boolean ligarCarro(){
        System.out.println("Carro ligado");
        return true;
}
}