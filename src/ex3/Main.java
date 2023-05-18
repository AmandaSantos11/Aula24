package ex3;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Amanda", 1, 40, 1.00);
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Peso: " + pessoa.getPeso());
        System.out.println("Idade inicial: " + pessoa.getIdade());
        System.out.println("Altura inicial: " + pessoa.getAltura());
        System.out.println("==================================");

        for (int i = 1; pessoa.getIdade() <= 21; i++) {
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Peso: " + pessoa.getPeso());
            pessoa.setIdade(1);
            System.out.println("Idade: " + pessoa.getIdade());
            pessoa.setAltura(0.5);
            System.out.println("Altura: " + pessoa.getAltura());
            System.out.println("---------------------------");

            if (pessoa.getIdade() == 21) {
                System.exit(0);
            }
        }
    }
}

