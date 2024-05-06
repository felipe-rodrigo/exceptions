package src;

import java.util.*;

public class PrincipalFinanciamento {
  public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);

    System.out.println("=================");
    System.out.print("|");
    System.out.print(" FINANCIAMENTO ");
    System.out.println("|");
    System.out.println("=================");

    System.out.print("Digite o valor total do Financiamento: ");
    double valorTotal = ler.nextDouble();
    System.out.print("Digite o valor da entrada: ");
    double entrada = ler.nextDouble();
    System.out.print("Digite a quantidade de parcelas: ");
    int parcelas = ler.nextInt();

    ler.close();
    try {
      
      Financiamento financiamento = new Financiamento(valorTotal, entrada, parcelas);

      System.out.println("==========================");
      System.out.print("|");
      System.out.print(" DADOS DO FINANCIAMENTO ");
      System.out.println("|");
      System.out.println("==========================");
      
      System.out.println("Valor Total: " + financiamento.valorTotal);
      System.out.println("Numero da Entrada: " + financiamento.entrada);
      System.out.println("Valor de Parcelas: " + financiamento.parcelas);
      System.out.println("Valor da Prestacao: " + financiamento.prestacao());
    }
    catch (RuntimeException excecaoFinanciamento) {
      System.out.println(excecaoFinanciamento.getMessage());
    }
  }
}
