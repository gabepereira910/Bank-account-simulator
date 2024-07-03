import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Insira o nome: ");
        String nome = leitura.nextLine();

        System.out.println("Insira o número da conta: ");
        int numeroDaConta = leitura.nextInt();

        Conta conta = new Conta(nome, numeroDaConta);

        System.out.println(conta);

        conta.exibeOp();
        int op = leitura.nextInt();

        while(op != 3) {
            if (op == 1) {
                System.out.println("Insira um valor a sacar: ");
                double valorASacar = leitura.nextDouble();
                conta.valorASacar(valorASacar);
                conta.exibeOp();
                op = leitura.nextInt();
            } else {
                if (op == 2) {
                    System.out.println("Insira um valor a depositar: ");
                    double valorADepositar = leitura.nextDouble();
                    conta.valorADepositar(valorADepositar);
                    conta.exibeOp();
                    op = leitura.nextInt();
                } else {
                    System.out.println("Até breve..");
                }
            }
        }
    }
}