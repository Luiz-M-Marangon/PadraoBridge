package abstraction;

import Implementador.TipoPreco;

public abstract class ItemEletronico {
    protected TipoPreco tipoPreco;

    protected ItemEletronico(TipoPreco tipoPreco){
        this.tipoPreco = tipoPreco;
    }

    public abstract void exibePrecoDetalhado();
}
