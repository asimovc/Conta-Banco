
/**
 * ContaTerminal
 */
import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in).useDelimiter("\n");

    System.out.print("Digite o número da sua Agência: ");
    String agencia = in.next();

    System.out.print("Digite o número da sua conta: ");
    int numeroConta = in.nextInt();

    System.out.print("Digite seu nome completo: ");
    String nomeCliente = in.next();

    System.out.print("Digite o seu saldo: ");
    float saldo = in.nextFloat();

    System.out.printf(
        "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque%n",
        nomeCliente, agencia, numeroConta, saldo);

    in.close();
  }
}
