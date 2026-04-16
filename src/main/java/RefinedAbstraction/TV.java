package RefinedAbstraction;

import Implementador.TipoPreco;
import abstraction.ItemEletronico;

public class TV extends ItemEletronico {
    String tipoProduto;
    double custo;

    public TV(TipoPreco tipoPreco){
        super(tipoPreco);
        this.tipoProduto = "televisão";
        this.custo = 2000;
    }

    @Override
    public void exibePrecoDetalhado(){
        tipoPreco.exibePrecoProduto(tipoProduto, custo);
    }
}
