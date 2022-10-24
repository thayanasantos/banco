package desafio.banco.java;

public interface IConta {


      void sacar( double valor);
      void depositar(double valor);

      void transerir(double valor, Conta contaDestino);

      void imprimirExtratos();
}
