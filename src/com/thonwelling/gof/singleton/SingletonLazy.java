package com.thonwelling.gof.singleton;

/**
 * Singleton Preguiçoso
 *
 * @author THONWELLING
 * */
public class SingletonLazy {
  private static SingletonLazy instancia;

  // aqui está o pulo do gato do Singleton esse contrutor tem que ser privado e é isso que vai garantir que ninguém
  // externamente vai conseguir instanciar essepadrão de projeto.
  private SingletonLazy() {
    super();
  }

  public static SingletonLazy getInstancia() {

    if (instancia == null) {
      instancia = new SingletonLazy();
    }
    return instancia;
  };
}
