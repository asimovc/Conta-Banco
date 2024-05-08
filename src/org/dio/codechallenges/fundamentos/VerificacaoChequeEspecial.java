import java.util.Scanner;

public class VerificacaoChequeEspecial {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    double saldo = in.nextDouble();
    double saque = in.nextDouble();
    double limiteChequeEspecial = 500;

    if (saque < saldo) {
      System.out.println("Transação realizada com sucesso.");
    } else {

      if (saque - saldo < limiteChequeEspecial) {
        System.out.println("Transação realizada com sucesso utilizando o cheque especial.");
      } else {
        System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
      }
    }

    in.close();
  }
}
