package ex1;
public class Caixa {
    private double saldo;
    private double credito;
    private double debito;

    //construtor
    public Caixa(double saldo, double credito, double debito){
        this.saldo = saldo;
        this.credito = credito;
        this.debito = debito;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setCredito(double credito) {
        this.credito = credito;
    }
    public double funcaoCredito(){
        return saldo += credito;
    }
    public void setDebito(double debito) {
        this.debito = debito;
    }
    public double funcaoDebito(){
        return saldo -= debito;
    }
}