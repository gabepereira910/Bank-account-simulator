public class Conta {
    String nome;
    private int numeroDaConta;
    private double saldo;
    private double valorADepositar;
    private double valorASacar;

    public String getNome() {
        return nome;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public Conta(String nome, int numeroDaConta) {
        this.nome = nome;
        this.numeroDaConta = numeroDaConta;
    }

    public double valorADepositar(double valorADepositar) {
        this.valorADepositar = valorADepositar;
        saldo += valorADepositar;
        System.out.println("Saldo atualizado: R$" + saldo);
        return 0;
    }

    public double valorASacar(double valorASacar) {
        if(valorASacar > saldo) {
            System.out.println("Saldo insuficiente");
            System.out.println("Saldo permanece: R$" + saldo);
            return 0;
        }

        this.valorASacar = valorASacar;
        saldo -= valorASacar;
        double saldoFinal = saldo - 5;
        System.out.println("Valor da taxa após saque: R$ 5,00");
        System.out.println("Saldo atualizado: R$" + saldoFinal);
        return 0;
    }

    public String toString() {
        return "Nome: " + getNome() + "\n" + "Número da conta: " + getNumeroDaConta();
    }

    public void exibeOp() {
        System.out.println("==================");
        System.out.println("Insira uma opção:");
        System.out.println("1 - SACAR");
        System.out.println("2 - DEPOSITAR");
        System.out.println("3 - SAIR");
        System.out.println("==================");
    }

}
