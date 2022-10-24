package desafio.banco.java;


import lombok.Getter;

public abstract class Conta implements IConta {
@Getter


    private static final int AGENCIA_PADRAO = 0001;
    private static int SEQUENCIAL = 1;
    @Getter
    protected int agencia;
    protected int numero;
    @Getter
    protected double saldo;
    protected Cliente cliente;


    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

        @Override
        public void sacar ( double valor){
            saldo -= valor;

        }

        @Override
        public void depositar ( double valor){
            saldo += valor;
        }

        @Override
        public void transerir ( double valor, Conta contaDestino){
            this.sacar(valor);
            contaDestino.depositar(valor);
        }

        protected void imprimirInosComuns() {
        System.out.println("imprimir extratos ");
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}


