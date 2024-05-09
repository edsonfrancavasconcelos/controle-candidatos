package candidatura;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

  public static void main(String[] args) {
    // Chamando o método de seleção de candidatos
    selecaoCandidatos();

    // Analisando candidatos com diferentes salários pretendidos
    analizarCandidato(1900.0);
    analizarCandidato(2200.0);
    analizarCandidato(2000.0);
  }

  static void selecaoCandidatos() {
    // Array com lista de candidatos
    String[] candidatos = {"Edson", "Valéria", "John", "Agnus", "Marcia", "Pedro", "Ana", "Elizabeth", "Arthur", "Hugo"};
    int candidatosSelecionados = 0;
    int candidatoAtual = 0;
    double salarioBase = 2000.0;
    while (candidatosSelecionados < 5) {
      String candidato = candidatos[candidatoAtual];
      double salarioPretendido = valorPretendido();

      System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido); // Corrigido: "salário"
      if (salarioBase >= salarioPretendido) {
        System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
        candidatosSelecionados++;
      }
      candidatoAtual++;
    }
  }

  static void analizarCandidato(double salarioPretendido) {
    double salarioBase = 2000.0;
    if (salarioBase > salarioPretendido) {
      System.out.println("Ligar para o candidato");
    } else if (salarioBase == salarioPretendido) { // Corrigido: Adição de chaves
      System.out.println("Ligar para o candidato com uma contra proposta");
    } else {
      System.out.println("Aguardando o resultado dos demais candidatos");
    }
  }

  // Método para gerar um valor de salário pretendido aleatório
  static double valorPretendido() {
    return ThreadLocalRandom.current().nextDouble(1500.0, 2500.0); // Retorna um valor entre 1500 e 2500
  }
}
