package desafio.banco.java;

public class ContaCorrente extends Conta {
    public ContaCorrente (Cliente cliente){
        super(cliente);
    }

    @Override
    public void imprimirExtratos() {
        System.out.println("Extrato da conta corrente");
        super.imprimirInosComuns();


    }

}
