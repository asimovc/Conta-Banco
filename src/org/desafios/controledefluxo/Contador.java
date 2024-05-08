import java.util.Scanner;

public class Contador {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    System.out.print("Digite o primeiro parâmetro: ");
    int parametroUm = in.nextInt();

    System.out.print("Digite o segundo parâmetro: ");
    int parametroDois = in.nextInt();

    try {

      contar(parametroUm, parametroDois);

    } catch (ParametrosInvalidosException e) {

      System.out.println("O segundo paramêtro deve ser maior que o primeiro");

    }

    in.close();
  }

  static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

    if (parametroUm > parametroDois) {
      throw new ParametrosInvalidosException();
    }

    int contagem = parametroDois - parametroUm;

    for (int i = 1; i < contagem; i++) {
      System.out.println("Imprimindo o número " + i);
    }
  }
}
