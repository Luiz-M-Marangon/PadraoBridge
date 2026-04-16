package ConcreteImplementor;

import Implementador.TipoPreco;

public class PrecoCNPJ implements TipoPreco {

    @Override
    public void exibePrecoProduto(String tipoProduto, double custo){
        System.out.println("O preço da " + tipoProduto + " para outras empresas parceiras é R$" + custo * 0.7);
    }
}
