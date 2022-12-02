package com.thonwelling.gof;

import com.thonwelling.gof.facade.Facade;
import com.thonwelling.gof.singleton.SingletonEager;
import com.thonwelling.gof.singleton.SingletonLazy;
import com.thonwelling.gof.singleton.SingletonLazyHolder;
import com.thonwelling.gof.strategyMode.*;

public class Teste {
  public static void main(String[] args) {

    //Testes Relacionados ao Design Pattern Singleton
    SingletonLazy lazy = SingletonLazy.getInstancia();
    System.out.println(lazy);

    lazy = SingletonLazy.getInstancia();
    System.out.println(lazy);


    SingletonEager eager = SingletonEager.getInstancia();
    System.out.println(eager);

    eager = SingletonEager.getInstancia();
    System.out.println(eager);


    SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
    System.out.println(lazyHolder);

    lazyHolder = SingletonLazyHolder.getInstancia();
    System.out.println(lazyHolder);

    //Strategy

    Comportamento  defensivos = new ComportamentoDefensivo();
    Comportamento  normal = new ComportamentoNormal();
    Comportamento  ofensivo = new ComportamentoOfensivo();

    Robo robo= new Robo();
    robo.setComportamento(ofensivo);
    robo.mover();
    robo.mover();
    robo.mover();

    robo.setComportamento(defensivos);
    robo.mover();
    robo.mover();

    robo.setComportamento(normal);
    robo.mover();
    robo.mover();
    robo.mover();
    robo.mover();

    //Facade
    Facade facade = new Facade();

    facade.migrarCliente("Thonwelling", "07071000");
  }
}
