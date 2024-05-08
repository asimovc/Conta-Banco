import java.util.Scanner;

public class VerificadorElegibilidadeConta {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int idade = in.nextInt();

    if (idade >= 18) {
      System.out.println("Voce esta elegivel para criar uma conta bancaria.");
    } else {
      System.out.println("Voce nao esta elegivel para criar uma conta bancaria.");
    }

    in.close();
  }
}
