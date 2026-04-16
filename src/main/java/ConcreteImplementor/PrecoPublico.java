package ConcreteImplementor;

import Implementador.TipoPreco;

public class PrecoPublico implements TipoPreco {

    @Override
    public void exibePrecoProduto(String tipoProduto, double custo){
        System.out.println("O preço da " + tipoProduto + " para empresas públicas é R$" + custo * 0.8);
    }
}
