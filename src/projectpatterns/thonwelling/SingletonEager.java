package projectpatterns.thonwelling;


/**
 * Singleton Apressado
 *
 * @author THONWELLING
 * */
public class SingletonEager {

  //Vai instanciar direto para depois quando precisar devolver já está tudo pronto
  private static final SingletonEager instancia = new SingletonEager();

  private SingletonEager() {
    super();
  }

  public static SingletonEager getInstancia() {
    return instancia;
  };
}
