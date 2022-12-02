package subsistema2;

import com.thonwelling.gof.singleton.SingletonEager;

public class CepApi {
  private static final CepApi instancia = new CepApi();

  private CepApi() {
    super();
  }

  public static CepApi getInstancia() {
    return instancia;
  };

  public String recuperarCidade(String cep) {
    return "Guarulhos";
  };

  public String recuperarEstado(String cep) {
    return "SP";
  };
}
