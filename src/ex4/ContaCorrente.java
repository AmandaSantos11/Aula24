package ex4;
public class ContaCorrente {
    private String nomeCorrentista;
    private int numeroDaConta;
    private double saldo;
    private double valorDigitado;

    public ContaCorrente(String nomeCorrentista,int numeroDaConta,double saldo,double valorDigitado ){
        this.nomeCorrentista = nomeCorrentista;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        this.valorDigitado = valorDigitado;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double depositarNaConta(){
        return valorDigitado += saldo;
    }
    public double sacarDinheiro(double valorDigitado){
        if (valorDigitado > saldo){
            System.out.println("Valor indisponível para saque");
            System.exit(0);
        }
        return saldo -= valorDigitado ;
    }
}