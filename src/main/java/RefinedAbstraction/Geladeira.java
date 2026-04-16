package RefinedAbstraction;

import Implementador.TipoPreco;
import abstraction.ItemEletronico;

public class Geladeira extends ItemEletronico {
    String tipoProduto;
    double custo;

    public Geladeira(TipoPreco tipoPreco){
        super(tipoPreco);
        this.tipoProduto = "Geladeira";
        this.custo = 3500;
    }

    @Override
    public void exibePrecoDetalhado(){
        tipoPreco.exibePrecoProduto(tipoProduto, custo);
    }
}

