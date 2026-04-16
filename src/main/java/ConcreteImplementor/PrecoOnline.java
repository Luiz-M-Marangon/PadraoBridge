package ConcreteImplementor;

import Implementador.TipoPreco;

public class PrecoOnline implements TipoPreco {

    @Override
    public void exibePrecoProduto(String tipoProduto, double custo){
        System.out.println("O preço da " + tipoProduto + " em loja online é R$" + custo * 0.9);;
    }
}
