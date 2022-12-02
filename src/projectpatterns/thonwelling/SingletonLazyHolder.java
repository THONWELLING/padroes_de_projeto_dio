package projectpatterns.thonwelling;

/**
 * Singleton LazyHolder
 *
 * @see <a href="http://www.stackoverflow.com/a/24018148>Referência</a>"
 * Ele encapsula a instância em uma classe estática interna que ele vai chamar de InstanceHolder
 * @author THONWELLING
 * */
public class SingletonLazyHolder {
  private static class InstanceHolder {
    private static final SingletonLazyHolder instancia = new SingletonLazyHolder();
  }
  private SingletonLazyHolder() {
    super();
  }

  public static SingletonLazyHolder getInstancia() {
    return InstanceHolder.instancia;
  };
}
