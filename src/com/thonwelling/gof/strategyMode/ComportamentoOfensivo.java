package com.thonwelling.gof.strategyMode;

public class ComportamentoOfensivo implements Comportamento {

  @Override
  public void mover() {
    System.out.println("Movendo-se Ofensivamente...");
  }
}
