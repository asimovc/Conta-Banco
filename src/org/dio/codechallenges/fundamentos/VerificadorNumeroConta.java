import java.util.Scanner;

public class VerificadorNumeroConta {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    try {
      String numeroConta = in.next();

      verificarNumeroConta(numeroConta);

      System.out.println("Numero de conta valido.");

    } catch (IllegalArgumentException e) {
      System.out.println("Erro: " + e.getMessage());

    } finally {
      in.close();
    }
  }

  private static void verificarNumeroConta(String numeroConta) {
    if (numeroConta.length() < 8 || numeroConta.length() > 8) {
      throw new IllegalArgumentException();
    }
  }
}
