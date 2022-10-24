package desafio.banco.java;

import java.util.List;

public class Banco {

@lombok.Setter
@lombok.Getter


    private   String nome;


    private List<Conta> contas;

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }


}
