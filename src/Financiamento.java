package src;

public class Financiamento {
  
  public Double valorTotal;
  public Double entrada;
  public Integer parcelas;

  public Financiamento(double valorTotal, double entrada, int parcelas) {

    // Numero minimo de entrada
    if (entrada < valorTotal * 0.2) {
      // Como camada de dominio não pode ter interação com a tela, utiliza-se então o lançamento de tratamento de exceção
      throw new RuntimeException("ERRO: Entrada deve ser, no minimo, 20% do valor total");
    } 
    // Numero minimo de Parcelas 
    else if (parcelas < 6) { 
      throw new RuntimeException("ERRO: Numero minimo de parcelas deve ser igual a 6");
    }

    this.valorTotal = valorTotal;
    this.entrada = entrada;
    this.parcelas = parcelas;
  }

  public double prestacao() {
    return (valorTotal - entrada) / parcelas;
  }
}
