package ConcreteImplementor;

import Implementador.TipoPreco;

public class PrecoLojaFisica implements TipoPreco {

    @Override
    public void exibePrecoProduto(String tipoProduto, double custo){
        System.out.println("O preço da " + tipoProduto + " na loja física é de R$" + custo);
    }
}
