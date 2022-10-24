package desafio.banco.java;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtratos() {
        System.out.println("Extrato da conta poupanca");
        super.imprimirInosComuns();

    }
}
