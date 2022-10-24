package desafio.banco.java;

public class Main {
    public static void main(String[] args) {

        Cliente thayana = new Cliente();
        thayana.setNome("Thayana");


        Conta cc = new ContaCorrente(thayana);
        Conta poupanca = new ContaPoupanca(thayana);

        cc.depositar(200);
        cc.transerir(100, poupanca);

        cc.imprimirExtratos();
        poupanca.imprimirExtratos();
    }
}
