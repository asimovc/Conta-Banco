import java.util.Scanner;
import java.util.Locale;

public class SimulacaoBancaria {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in).useLocale(Locale.US);
    double saldo = 0;
    boolean continuar = true;

    while (continuar) {

      int opcao = input.nextInt();

      switch (opcao) {
        case 0:
          continuar = false;

          System.out.println("Programa encerrado.");
          break;
        case 1:
          double deposito = input.nextDouble();

          saldo = saldo + deposito;

          System.out.println("Saldo atual: " + saldo);
          break;
        case 2:
          double saque = input.nextDouble();

          if (saque > saldo) {
            System.out.println("Saldo insuficiente.");
          } else {
            saldo = saldo - saque;

            System.out.println("Saldo atual: " + saldo);
          }
          break;
        case 3:
          System.out.println("Saldo atual: " + saldo);
          break;
        default:
          System.out.println("Opção inválida. Tente novamente.");
      }
    }

    input.close();
  }
}
