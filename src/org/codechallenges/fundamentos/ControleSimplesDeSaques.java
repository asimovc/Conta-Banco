import java.util.Scanner;

public class ControleSimplesDeSaques {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    double limiteDiario = in.nextDouble();

    for (boolean i = true; i == true;) {
      double valorSaque = in.nextDouble();

      if (valorSaque == 0) {
        i = false;
        System.out.println("Transacoes encerradas.");
      } else if (valorSaque < limiteDiario) {
        limiteDiario -= valorSaque;

        System.out.println("Saque realizado. Limite restante: " + limiteDiario);
      } else {
        i = false;
        System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
      }
    }

    in.close();
  }
}
