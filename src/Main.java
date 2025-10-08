import veiculos.Carro;
import veiculos.Moto;
import veiculos.Caminhao;
import veiculos.Veiculo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Veiculo carro = new Carro("Toyota", "Corolla", 2022, 4);
        Veiculo moto = new Moto("Honda", "CB500", 2021, 500);
        Veiculo caminhao = new Caminhao("Volvo", "FH", 2020, 20);

        System.out.println("=== Cadastro de Veículos ===");
        carro.exibirDetalhes();
        System.out.println("----------------------------");
        moto.exibirDetalhes();
        System.out.println("----------------------------");
        caminhao.exibirDetalhes();

        System.out.println("\n=== Locação ===");
        Locacao locacao = new Locacao(carro, LocalDate.of(2025, 10, 1), LocalDate.of(2025, 10, 5));
        locacao.exibirResumoLocacao();

        System.out.println("\nDisponibilidade do carro após locação: " + (carro.isDisponivel() ? "Sim" : "Não"));
    }
}
