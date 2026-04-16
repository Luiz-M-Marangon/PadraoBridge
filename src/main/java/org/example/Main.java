package org.example;

import ConcreteImplementor.PrecoCNPJ;
import ConcreteImplementor.PrecoLojaFisica;
import ConcreteImplementor.PrecoOnline;
import ConcreteImplementor.PrecoPublico;
import RefinedAbstraction.Geladeira;
import RefinedAbstraction.TV;
import abstraction.ItemEletronico;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n===Preços para produtos===\n");

        System.out.println("Preço da TV:");

        ItemEletronico eItem = new TV(new PrecoOnline());
        eItem.exibePrecoDetalhado();

        eItem = new TV(new PrecoLojaFisica());
        eItem.exibePrecoDetalhado();

        eItem = new TV(new PrecoCNPJ());
        eItem.exibePrecoDetalhado();

        eItem = new TV(new PrecoPublico());
        eItem.exibePrecoDetalhado();

        System.out.println("\nPreço da geladeira:");

        eItem = new Geladeira(new PrecoOnline());
        eItem.exibePrecoDetalhado();

        eItem = new Geladeira(new PrecoLojaFisica());
        eItem.exibePrecoDetalhado();

        eItem = new Geladeira(new PrecoCNPJ());
        eItem.exibePrecoDetalhado();

        eItem = new Geladeira(new PrecoPublico());
        eItem.exibePrecoDetalhado();
    }
}
