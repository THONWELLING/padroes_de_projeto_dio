package subsistema1.crm;

public class CrmService {

  private CrmService() {
    super();
  }

  public static void gravarCliente(String name, String cep, String estado, String cidade) {
    System.out.println("Cliente Salvo no Sistema de Crm: ");
    System.out.println(name);
    System.out.println(cep);
    System.out.println(estado);
    System.out.println(cidade);
  };
}
